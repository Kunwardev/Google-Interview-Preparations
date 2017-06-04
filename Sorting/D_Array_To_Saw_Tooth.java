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
public class D_Array_To_Saw_Tooth
{
    private static void convert(int[] arr){
        for(int i=1;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    
    private static void optimized_convert(int[] arr){
        for(int i=1;i<arr.length-1;i+=2){
            if(arr[i] < arr[i-1] && i > 0){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            if(arr[i] < arr[i+1] && i < arr.length-1){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,5,7,2,4,6,8};
        D_Heap_Sort q = new D_Heap_Sort();
        //Complexity is O(nLgn)
//        q.sort(arr);
//        convert(arr);
        optimized_convert(arr);
        for(int p:arr)
            System.out.print(p+" ");
    }
    
}
