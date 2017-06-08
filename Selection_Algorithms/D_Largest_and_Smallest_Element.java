/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Selection_Algorithms;

/**
 *
 * @author Kunwar
 */
public class D_Largest_and_Smallest_Element
{
    private static void find(int[] arr){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("min: "+min+" "+"max: "+max);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,4,7,10,6};
        find(arr);
    }
    
}
