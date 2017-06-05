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
public class E_Subsets_Sum
{
    private static void rec_sum(int[] arr, int l,int r, int sum){
        if(l >= r){
            System.out.print(sum+" ");
            return ;
        }
        rec_sum(arr, l+1, r, sum);
        rec_sum(arr, l+1, r, sum+arr[l]);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,4,3};
        rec_sum(arr, 0, arr.length, 0);
    }
    
}
