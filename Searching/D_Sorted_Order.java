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
public class D_Sorted_Order
{
    private static int orderedSearch(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
                return i;
            if(arr[i] > x)
                return -1;
        }
        return -1;
        
    }
}
