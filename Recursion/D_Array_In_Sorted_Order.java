/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author Kunwar
 */
public class D_Array_In_Sorted_Order
{
    private static boolean sorted(int[] arr, int index){
        if(arr.length == 1 || index == 0)
            return true;
        return (arr[index] < arr[index-1] ? false:sorted(arr, index-1));
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,7,4,5};
        System.out.println(sorted(arr, 4));
    }
    
}
