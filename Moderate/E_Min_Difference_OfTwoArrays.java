/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class E_Min_Difference_OfTwoArrays
{
    private int findSmallestDiff(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int a = 0, b = 0;
        int difference = Integer.MAX_VALUE;
        while(a < A.length && b < B.length){
            if(Math.abs(A[a] - B[b]) < difference){
                difference = Math.abs(A[a] - B[b]);
            }
            if(A[a] < B[b])
                a++;
            else
                b++;
        }
        return difference;
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{1,11,2,15};
        int[] B = new int[]{235,4,12,127,19,23};
        E_Min_Difference_OfTwoArrays e = new E_Min_Difference_OfTwoArrays();
        System.out.println(e.findSmallestDiff(A, B));
    }
    
}
