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
public class D_Find_Array
{
    private static void find(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[Math.abs(arr[i])] < 0){
                System.out.println("Duplicates Exist: "+arr[i]);
            }else
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{0,2,1,3,3,2};
        find(arr);
    }
    
}
