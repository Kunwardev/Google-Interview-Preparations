/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class D_Counting_Sort
{
    private static int[] countingSort(int[] data){
        int length = data.length;
        int[] count = new int[10];
        int[] output = new int[length];
        Arrays.fill(count, 0);
        
        for(int i=0;i<length;i++){
            count[data[i]]++;
        }
        
        for(int i=1;i<10;i++){
            count[i] = count[i] + count[i-1];
        }
        
        for(int i=0;i<length;i++){
            output[count[data[i]]-1] = data[i];
            --count[data[i]];
        }
        return output;
    }
    
    public static void main(String[] args)
    {
        int[] data = new int[]{5,4,1,4,2,3,5,1,3,2,2,4,2};
        data = countingSort(data);
        for(int p: data)
            System.out.print(p+" ");
    }
    
}
