/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class D_Find_Duplicates
{
    private static boolean find(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1])
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,7,3,5,8,9};
        System.out.println(find(arr));
    }
    
}
