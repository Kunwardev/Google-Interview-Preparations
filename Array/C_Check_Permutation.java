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
public class C_Check_Permutation
{
    private static boolean check(String a, String b){
        boolean[] checker = new boolean[26];
        boolean[] checker2 = new boolean[26];
        int length_a = a.length(), length_b = b.length();
        if(length_a != length_b || length_a >= 26 || length_b >= 26)
            return false;
        for(int i=0;i<length_a;i++){
            checker[a.charAt(i)-'a'] = true;
            checker2[b.charAt(i)-'a'] = true;
        }
        for(int i=0;i<length_a;i++){
            if(checker[i] != checker2[i])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        String a = "abcde";
        String b = "bdecaa";
        System.out.println(check(a, b));
    }
    
}
