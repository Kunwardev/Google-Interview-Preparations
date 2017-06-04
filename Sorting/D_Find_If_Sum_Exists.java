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
public class D_Find_If_Sum_Exists
{
    private static int BinarySearch(int[] arr, int c){
        int left = 0,high = arr.length-1;
        return BinarySearchHelper(arr, 0, high, c);
    }
    
    private static boolean find(int[] A, int[] B, int sum){
        D_Heap_Sort d = new D_Heap_Sort();
        d.sort(A);
        for(int i=0;i<A.length;i++){
            int c = sum - B[i];
            if(BinarySearch(B, c) > -1)
                return true;
        }
        return false;
    }

    private static int BinarySearchHelper(int[] arr, int low, int high, int c)
    {
        if(high >= low){
            int mid = low + (high-low)/2;
            if(arr[mid] == c)
                return mid;
            if(arr[mid] > c){
                return BinarySearchHelper(arr, low, mid-1, c);
            }else
                return BinarySearchHelper(arr, mid+1, high, c);
            }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{8,2,5,3,6,1};
        int[] B = new int[]{1,4,8,5,3,2};
        System.out.println(find(A, B, 15));
        
    }
    
}
