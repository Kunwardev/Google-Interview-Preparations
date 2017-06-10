/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

/**
 *
 * @author Kunwar
 */
public class D_Matrix_Parenthesis
{
    private int function(int[] P, int i, int j){
        if(i == j)
            return 0;
        int min = Integer.MIN_VALUE;
        for(int k=i;k<j;k++){
            int count = function(P, i, k) + function(P, k+1, j) + P[i-1]*P[k]*P[j];
            if(count > min)
                min = count;
        }
        return min;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5};
        D_Matrix_Parenthesis d = new D_Matrix_Parenthesis();
        System.out.println(d.function(arr, 1, arr.length-1));
    }
    
}
