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
public class D_Shell_Sort
{
    private static void shellSort(int[] arr){
        int length = arr.length;
        for(int gap = length/2;gap>0;gap--){
            for(int i=gap;i<length;i++){
                int temp = arr[i];
                int j;
                for(j=i;j>=gap && arr[j-gap] > temp; j-=gap)
                    arr[j] = arr[j-gap];
                arr[j] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{8,6,7,1,3,5};
        shellSort(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
