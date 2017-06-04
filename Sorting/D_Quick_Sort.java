/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

/**
 *
 * @author Kunwar
 */
public class D_Quick_Sort
{
    private static void quickSort(int[] arr, int low, int high){
        int pivot;
        if(low < high){
            pivot = partition(arr, low,high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high)
    {
        int left,right,pivot_item = arr[low];
        left = low;
        right = high;
        while(left < right){
            while(arr[left] <= pivot_item)
                left++;
            while(arr[right] > pivot_item)
                right--;
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        arr[low] = arr[right];
        arr[right] = pivot_item;
        return right;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{7,9,1,2,6,5,3};
        quickSort(arr, 0, arr.length-1);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
