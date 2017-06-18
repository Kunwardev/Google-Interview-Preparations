/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class E_Sum_Swap
{
    // Do it with sorting, iterate through to find the pair
    // More Optimal is the below method
    private int[] findSwapValues(int[] arr1, int[] arr2){
        Integer target = getTarget(arr1, arr2);
        if(target == null)
            return null;
        return findDifference(arr1, arr2, target);
    }
    
    private int sum(int[] arr){
        int sum = 0;
        for(int k: arr)
            sum+=k;
        return sum;
    }

    private Integer getTarget(int[] arr1, int[] arr2)
    {
        int sum1 = sum(arr1);
        int sum2 = sum(arr2);
        if((sum1 - sum2) % 2 != 0)
            return null;
        return (sum1-sum2)/2;
    }

    private int[] findDifference(int[] arr1, int[] arr2, Integer target)
    {
        HashSet<Integer> contents_2 = getContents(arr2);
        for(int one: arr1){
            int two = one - target;
            if(contents_2.contains(two)){
                int[] value = new int[]{one, two};
                return value;
            }
        }
        return null;
    }

    private HashSet<Integer> getContents(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int a: arr){
            set.add(a);
        }
        return set;
    }
    
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{4,1,2,1,1,2};
        int[] arr2 = new int[]{3,6,3,3};
        E_Sum_Swap e = new E_Sum_Swap();
        int[] a = (e.findSwapValues(arr1, arr2));
        System.out.println(a[0]+" "+a[1]);
        
    }
    
}
