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
public class D_Unordered_Linear_Search
{
    private static int search(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,68,9,5,2,23};
        System.out.println(search(arr, 2));
    }
    
}
