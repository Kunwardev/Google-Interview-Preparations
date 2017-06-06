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
public class D_Find_Sum_Closest_to_0
{
    private static int present(int[] arr){
        int i,j,length = arr.length, positveClose = Integer.MAX_VALUE, negativeClose = Integer.MIN_VALUE;
        Arrays.sort(arr);
        i=0;j=length-1;
        while(i < j){
            int temp = arr[i] + arr[j];
            if(temp > 0){
                if(temp < positveClose){
                    positveClose = temp;
                    
                }j--;
            }else if(temp < 0){
                if(temp > negativeClose){
                    negativeClose = temp;
                    
                }i++;
            }else{
                return temp;
            }
        }
        return Math.abs(negativeClose)>positveClose ? positveClose:negativeClose;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,-4,7,-5,2,3};
        System.out.println(present(arr));
    }
    
}
