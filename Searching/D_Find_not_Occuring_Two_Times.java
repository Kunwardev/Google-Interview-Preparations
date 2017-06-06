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
public class D_Find_not_Occuring_Two_Times
{
    private static int find(int[] arr){
        int number = 0;
        for(int i=0;i<arr.length;i++){
            number ^= arr[i];
        }
        return number;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,1,5,3,6,6,5,6};
        System.out.println(find(arr));
    }
    
}
