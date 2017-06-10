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
public class D_Max_Sum_With_Contiguous_Number
{
    int[] max = new int[100];
    private int maxSum(int[] arr){
        max[0] = arr[0];
        max[1] = (arr[0] > arr[1] ? arr[0] : arr[1]);
        for(int i=2;i<arr.length;i++){
            max[i] = (max[i-1] > max[i-2]+arr[i])?max[i-1]:max[i-2]+arr[i];
        }
        return max[arr.length-1];
    }
    
    public static void main(String[] args)
    {
        D_Max_Sum_With_Contiguous_Number d = new D_Max_Sum_With_Contiguous_Number();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,10};
        System.out.println(d.maxSum(arr));
        
    }
    
}
