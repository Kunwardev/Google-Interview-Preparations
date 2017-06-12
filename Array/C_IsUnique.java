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
public class C_IsUnique
{
    private static boolean function(char[] arr){
        boolean[] check = new boolean[26];
        for(int i=0;i<arr.length;i++){
            int value = arr[i] - 'a';
            if(check[value] == false)
                check[value] = true;
            else
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        char[] arr = new char[]{'h','e','l','o'};
        System.out.println(function(arr));
    }
    
}
