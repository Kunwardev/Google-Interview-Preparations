/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
public class E_Two_Sum
{
    private int[] findNumber(int[] A, int target){
        int[] result = new int[2];
        for(int i=0;i<A.length;i++){
            if(A[i] <= target){
                for(int j=i+1;j<A.length;j++){
                    if(A[i]+A[j] == target){
                        result[0] = i+1;
                        result[1] = j+1;
                    }
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,7,11,15};
        E_Two_Sum e = new E_Two_Sum();
        int[] a = e.findNumber(arr, 9);
        for(int i=0;i<2;i++)
            System.out.print(a[i]+" ");
    }
    
}
