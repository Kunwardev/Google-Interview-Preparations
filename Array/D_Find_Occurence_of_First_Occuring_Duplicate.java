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
public class D_Find_Occurence_of_First_Occuring_Duplicate
{
    private static int binarySearch(int[] arr, int low, int high, int data){
        if(high >= low){
            int mid = low+(high-low)/2;
            if(mid == low && arr[mid] == data || arr[mid] == data && arr[mid-1]<data)
                return mid;
            else if(arr[mid] >= data)
                return binarySearch(arr, low, mid-1, data);
            return binarySearch(arr, mid+1, high, data);
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,5,6,7};
        System.out.println(binarySearch(arr, 0, arr.length-1, 5));
    }
    
}
