/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Kunwar
 */
public class D_Longest_Increasing_Subsequence
{
    private int function(int[] arr){
        int[] LIS = new int[arr.length];
        int index_i = 0;
        Arrays.fill(LIS, 1);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && LIS[i] < LIS[j]+1){
                    LIS[i] = LIS[j] + 1;
                    if(max < LIS[i]){
                        max = LIS[i];
                        index_i = i;
                    }
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        int prev = index_i--;
        al.add(arr[prev]);
        while(index_i > 0){
            if(LIS[prev] - LIS[index_i] == 1){
                al.add(arr[index_i]);
                prev = index_i;
            }
            index_i--;
        }
        Collections.sort(al);
        System.out.println(al );
        return max;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,6,2,3,4,1,9,9,8,9,5};
        D_Longest_Increasing_Subsequence d = new D_Longest_Increasing_Subsequence();
        System.out.println(d.function(arr));
    }
    
}
