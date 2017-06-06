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
public class D_Find_Two_Missing_Mathematics
{
    private static int factorial(int n){
        int[] arr = new int[n+1];
        arr[0] = 1;arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    
    private static void find(int[] arr){
        int length = arr.length + 2;
        int sum = (length*(length+1))/2;
        int fact = factorial(length);
        // Using Equation: X+Y = S-(n*n+1)/2
        //                  XY = P/n!
    }
}
