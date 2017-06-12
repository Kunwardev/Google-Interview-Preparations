/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

/**
 *
 * @author Kunwar
 */
public class PartitionPractice
{
    private static void quicksort(int[] arr, int low, int high){
        if(low <= high){
            int pivot = partition(arr, low, high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int index = low - 1;
        for(int j=low;j<high;j++){
            if(arr[j]<= pivot){
                index++;
                int temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp;
            }
        }
        int temp = arr[index+1];
        arr[index+1] = arr[high];
        arr[high] = temp;
        return index+1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{9,8,7,5,4,6,3,1,2};
        quicksort(arr, 0, 8);
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
    
}
