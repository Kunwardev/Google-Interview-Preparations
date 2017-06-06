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
public class D_finding_Rotated_In_One_Scan
{
    private static int search(int[] arr, int left, int right, int data){
        if(left > right)
            return -1;
        int mid = (left+right)/2;
        if(data == arr[mid])
            return mid;
        else if(arr[left] <= arr[mid]){
            if(data >= arr[left] && data < arr[mid])
                return search(arr, left, mid-1,data);
            else return search(arr, mid+1, right, data);
        }else{
            if(data > arr[mid] && data <= arr[right])
                return search(arr, mid+1, right, data);
            return search(arr, left, mid-1, data);
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,6,7,1,2,3,4};
        System.out.println(search(arr, 0, arr.length-1, 1));
    }
    
}
