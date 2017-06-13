/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author Kunwar
 */
public class C_Magic_Index
{
    private int magicIndex(int[] arr){
        return magicFast(arr, 0, arr.length-1);
    }

    private int magicFast(int[] arr, int low, int high)
    {
        if(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == mid)
                return mid;
            else if(arr[mid] < mid){
                return magicFast(arr, mid+1, high);
            }else
                return magicFast(arr, low, mid-1);
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        C_Magic_Index c = new C_Magic_Index();
        int[] arr = new int[]{-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
        System.out.println(c.magicIndex(arr));
    }
    
}
