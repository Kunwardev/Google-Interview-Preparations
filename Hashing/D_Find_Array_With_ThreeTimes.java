/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Kunwar
 */
public class D_Find_Array_With_ThreeTimes
{
    // For Other Method, see in the Array Folders
    private static void find(int[] a){
        if(a.length >= 3){
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i: a){
                if(hm.containsKey(i)){
                    int p = hm.get(i);
                    hm.put(i, p+1);
                }else
                    hm.put(i, 1);
            }
            for(Entry<Integer, Integer> e: hm.entrySet()){
                if(e.getValue() == 3)
                    System.out.println(e.getKey());
            }
        }else{
            System.out.println("NOT POSSIBLE");
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,5,4,4,3,2,1};
        find(arr);
    }
    
}
