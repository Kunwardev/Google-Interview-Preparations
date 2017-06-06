/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class D_Find_Sum_Equal_K
{
    private static boolean present(int[] arr, int K){
        Arrays.sort(arr);
        int i=0, j = arr.length-1;
        for(;i<j;){
            if(arr[i]+arr[j] == K){
                System.out.println(arr[i]+" "+arr[j]);
                return true;
            }else if(arr[i]+arr[j] > K){
                j--;
            }else
                i++;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,4,2,5,7,8,6};
        System.out.println(present(arr, 18));
    }
    
}
