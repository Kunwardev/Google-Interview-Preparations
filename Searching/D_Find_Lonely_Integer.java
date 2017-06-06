/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

/**
 *
 * @author Kunwar
 */
public class D_Find_Lonely_Integer
{
    private static int find(int[] arr){
        int x = 0;
        for(int i=0;i<arr.length;i++){
            x ^= arr[i];
        }
        return x;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,2,2,3,4,5,5,4,6,6};
        System.out.println(find(arr));
    }
    
}
