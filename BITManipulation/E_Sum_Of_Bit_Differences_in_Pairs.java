/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BITManipulation;

/**
 *
 * @author Kunwar
 */
public class E_Sum_Of_Bit_Differences_in_Pairs
{
    private int sumBitDifference(int[] arr, int n){
        int ans = 0;
        for(int i=0;i<32;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if((arr[j] & (1 << i)) > 0)
                    count++;
            }
            ans += (count * (n-count)*2);
        }
        return ans;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,5};
        E_Sum_Of_Bit_Differences_in_Pairs e = new E_Sum_Of_Bit_Differences_in_Pairs();
        System.out.println(e.sumBitDifference(arr, arr.length));
    }
    
}
