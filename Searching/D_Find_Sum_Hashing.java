/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class D_Find_Sum_Hashing
{
    private static boolean present(int[] arr, int K){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int sum = K - arr[i];
            //System.out.println(sum);
            if(hm.containsKey(sum) && arr[i] != sum){
                System.out.println(sum+" "+arr[i]);
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,5,3,6,2,4};
        System.out.println(present(arr, 10));
    }
    
}
