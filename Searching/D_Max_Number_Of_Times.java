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
public class D_Max_Number_Of_Times
{
    private static void maxRepetitions(int[] arr){
        int i=0,max = 0,index = 0, n = arr.length,counter=0;
        for(;i<n;i++){
            arr[arr[i]%n] += n;
        }
        for(;i<n;i++){
            if(arr[i]/n > max){
                max = arr[i]/n;
                index = i;
            }
        }
        System.out.println(arr[index]);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,1,2,2,3,3,4,4,4,4,4};
        maxRepetitions(arr);
    }
    
}
