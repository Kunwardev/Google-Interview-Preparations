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
public class D_Find_Missing_Sort
{
    // Will give error if the first element is missing
    // Also with the hashtable
    private static int find(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] != 1)
                return (arr[i+1]-1);
        }
        return arr[arr.length-1]+1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,4,3,2,6};
        System.out.println(find(arr));
    }
    
}
