/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class C_CountSteps
{
    private int countSteps(int n){
        int[] arr = new int[n+1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        return countStepsHelper(n, arr);
    }

    private int countStepsHelper(int n, int[] arr)
    {
        if(n < 0)
            return 0;
        if(arr[n] > 0)
            return arr[n];
        arr[n] = countStepsHelper(n-1, arr)+countStepsHelper(n-2, arr)+countStepsHelper(n-3, arr);
        return arr[n];
    }
    
    public static void main(String[] args)
    {
        int n = 4;
        C_CountSteps c = new C_CountSteps();
        System.out.println(c.countSteps(n));
    }
    
}
