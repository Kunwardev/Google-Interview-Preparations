/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

/**
 *
 * @author Kunwar
 */
public class C_Palindrome_Permutation
{
    private static int[] countAlpha(String a){
        int[] count = new int[26];
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)-'a']++;
        }
        return count;
    }
    
    private static boolean check(int[] count){
        boolean foundOdd = false;
        for(int i=0;i<26;i++){
            if(count[i]%2 == 1){
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        String t = "tacoat";
        int[] al = countAlpha(t);
        System.out.println(check(al));
    }
    
}
