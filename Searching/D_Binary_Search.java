/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

/**
 *
 * @author Kunwar
 */
public class D_Binary_Search
{
    private static int binarySearch(int[] arr, int data){
        return binarySearchHelper(arr, data, 0, arr.length-1);
    }

    private static int binarySearchHelper(int[] arr, int data, int low, int high)
    {
        if(low <= high){
        int mid = (low+high)/2;
        if(arr[mid] == data)
            return mid;
        else if(arr[mid] > data){
            return binarySearchHelper(arr, data, low, mid-1);
        }else
            return binarySearchHelper(arr, data, mid+1, high);}
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,5,7,9,10};
        System.out.println(binarySearch(arr, 9));
    }
    
}
