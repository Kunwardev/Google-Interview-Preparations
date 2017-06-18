/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

/**
 *
 * @author Kunwar
 */
public class E_SubSort
{
    private void findUnsortedSequence(int[] array){
        int end_left = findEndOfLeftSubsequence(array);
        if(end_left >= array.length - 1)
            return;
        int start_right = findStartOfRightSubsequence(array);
        
        int max_Index = end_left;
        int min_Index = start_right;
        
        for(int i=end_left+1;i<start_right;i++){
            if(array[i] < array[min_Index])
                min_Index = i;
            if(array[i] > array[max_Index])
                max_Index = i;
        }
        
        int left_Index = shrinkLeft(array, min_Index, end_left);
        int right_Index = shrinkRight(array, max_Index, start_right);
        System.out.println(left_Index+" "+right_Index);
    }

    private int findEndOfLeftSubsequence(int[] array)
    {
        for(int i=1;i<array.length;i++){
            if(array[i] < array[i-1])
                return i-1;
        }
        return array.length-1;
    }

    private int findStartOfRightSubsequence(int[] array)
    {
        for(int i=array.length-2;i>=0;i--){
            if(array[i] > array[i+1])
                return i+1;
        }
        return 0;
    }

    private int shrinkLeft(int[] array, int min_Index, int end_left)
    {
        int comp = array[min_Index];
        for(int i=end_left-1;i>=0;i--){
            if(array[i] <= comp)return i+1;
        }
        return 0;
    }

    private int shrinkRight(int[] array, int max_Index, int start_right)
    {
        int comp = array[max_Index];
        for(int i=start_right;i<array.length;i++)
            if(array[i] >= comp)
                return i-1;
        return array.length - 1;
    }
    
    public static void main(String[] args)
    {
        E_SubSort e = new E_SubSort();
        int[] array = new int[]{1,2,4,7,10,11,8,12,5,6,16,18,19};
        e.findUnsortedSequence(array);
    }
    
}
