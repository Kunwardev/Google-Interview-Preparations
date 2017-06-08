/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Selection_Algorithms;

/**
 *
 * @author Kunwar
 */
public class D_K_Smallest_Elements
{
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int pivotPosition = start++;
        while(start <= end && arr[start] < pivot){
            start++;
        }
        while(end >= start && arr[end] >= pivot){
            end--;
        }
        
        if(start > end){
            int temp = arr[end];
            arr[end] = arr[pivotPosition];
            arr[pivotPosition] = temp;
        }else{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return end;
    }
    
    private static int findK(int[] arr, int k, int start, int end){
        int pivot = partition(arr, start, end);
        if(pivot == k-1)
            return arr[k-1];
        if(k-1 < pivot)
            return findK(arr, k, start, pivot-1);
        else
            return findK(arr, k, pivot+1, end);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,5,8,9,2,3,6};
        System.out.println(findK(arr, 3, 0, arr.length-1));
    }
    
}
