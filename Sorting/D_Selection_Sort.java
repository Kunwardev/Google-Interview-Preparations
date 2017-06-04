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
public class D_Selection_Sort
{
    private static void selectionSort(int[] arr){
        int i,j,min,temp;
        for(i=0;i<arr.length-1;i++){
            min = i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            if(min != i){
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,9,7,1,3,0,2};
        selectionSort(arr);
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
    
}
