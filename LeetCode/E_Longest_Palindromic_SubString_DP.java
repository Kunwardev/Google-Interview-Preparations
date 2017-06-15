/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
public class E_Longest_Palindromic_SubString_DP
{
    private String longestPalindrome(String s){
        if(s == null)
            return null;
        if(s.length() <= 1)
            return s;
        int maxLen = 0;
        String longestStr = null;
        int length = s.length();
        int[][] table = new int[length][length];
        
        for(int i=0;i<length;i++){
            table[i][i] = 1;
        }
        
        for(int i=0;i<=length-2;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                table[i][i+1] = 1;
                longestStr = s.substring(i, i+2);
            }
        }
        
        for(int l=3;l<=length;l++){
            for(int i=0;i<=length-l;i++){   //(length-L)
                int j = i+l-1;
                if(s.charAt(i) == s.charAt(j)){
                    table[i][j] = table[i+1][j-1];
                    if(table[i][j] == 1 && l > maxLen)
                        longestStr = s.substring(i, j+1);
                }else
                    table[i][j] = 0;
            }
        }
        return longestStr;
    }
    
    public static void main(String[] args)
    {
        String str = "dabcba";
        E_Longest_Palindromic_SubString_DP e = new E_Longest_Palindromic_SubString_DP();
        System.out.println(e.longestPalindrome(str));
    }
    
}
