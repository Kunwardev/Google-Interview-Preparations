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
public class Find_Duplicates_HashTable
{
    private static boolean find(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i]))
                return true;
            hm.put(arr[i], 1);
        }
        
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,4,6,8,3,2,1};
        System.out.println(find(arr));
    }
    
}
