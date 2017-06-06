/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

/**
 *
 * @author Kunwar
 */
public class D_Find_Repeating_Count_Array
{
    private static void find(int[] arr){
        int[] count = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
            if(count[arr[i]] == 2){
                System.out.println(arr[i]);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,3,1};
        find(arr);
    }
    
}
