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
public class D_Find_Two_Repeating_Elements
{
    private static void find(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{4,2,4,5,3,2,1};
        find(arr);
    }
    
}
