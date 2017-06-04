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
public class D_Bubble_Sort
{
    private static void bubbleSort(int[] arr){
        int i,j;
        for(j=arr.length-1;j>=0;j--){
            for(i=0;i <= j-1 ;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,2,5,1,7,9,0};
        bubbleSort(arr);
        for(int p: arr){
            System.out.print(p+" ");
        }
    }
    
}
