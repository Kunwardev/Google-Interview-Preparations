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
public class C_Magic_Index_Duplicates
{
    private int magicIndex(int[] arr){
        return magicIndexFast(arr, 0, arr.length-1);
    }

    private int magicIndexFast(int[] arr, int low, int high)
    {
        if(high < low)
            return -1;
        int mid = (low + high)/2;
        int midValue = arr[mid];
        if(midValue == mid)
            return mid;
            
        int leftIndex = Math.min(mid-1, midValue);
        int left = magicIndexFast(arr, low, leftIndex);
        if(left >= 0)
            return left;
            
        int rightIndex = Math.max(mid+1, midValue);
        int right = magicIndexFast(arr, rightIndex, high);
        return right;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
        C_Magic_Index_Duplicates c = new C_Magic_Index_Duplicates();
        System.out.println(c.magicIndex(arr));
    }
    
}
