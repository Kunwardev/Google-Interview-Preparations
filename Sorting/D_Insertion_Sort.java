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
public class D_Insertion_Sort
{
    private static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{6,8,9,1,2,4,7};
        insertionSort(arr);
        for(int j: arr)
            System.out.print(j+" ");
    }
    
}
