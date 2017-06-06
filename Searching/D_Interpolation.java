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
public class D_Interpolation
{
    private static int interpolation(int[] arr, int data){
        int low = 0, high = arr.length-1, mid;
        while(arr[low] <= data && arr[high] >= data){
            if(arr[high] - arr[low] == 0)
                return (high+low)/2;
            mid = low+((data-arr[low])*(high-low))/(arr[high]-arr[low]);
            if(arr[mid] < data)
                low = mid+1;
            else if(arr[mid] > data)
                high = mid-1;
            else
                return mid;
        }
        if(arr[low] == data)
            return low;
        else
            return -1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,5,6,7,8,9,10};
        System.out.println(interpolation(arr, 1));
    }
    
}
