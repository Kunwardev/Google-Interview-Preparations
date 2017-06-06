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
public class D_Find_Missing_Number
{
    private static int findMissing(int[] arr){
        int found = 0, length = arr.length+1;
        for(int i: arr){
            found+=i;
        }
        int sum = (length*(length+1))/2;
        return (sum - found);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,3,5,4};
        System.out.println(findMissing(arr));
    }
    
}
