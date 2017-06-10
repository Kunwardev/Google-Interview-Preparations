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
public class D_Max_Value_Subsequence
{
    private int find(int[] arr){
        int sum = 0,maxSum = 0, i = 0;
        for(;i<arr.length;i++){
            sum = Math.max(arr[i], sum+arr[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args)
    {
        D_Max_Value_Subsequence s = new D_Max_Value_Subsequence();
        int[] arr = new int[]{1,-3,4,-2,-1,6};
        System.out.println(s.find(arr));
    }
    
}
