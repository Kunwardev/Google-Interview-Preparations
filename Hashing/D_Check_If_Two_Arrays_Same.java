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
public class D_Check_If_Two_Arrays_Same
{
    private static HashMap<Integer, Integer> frequency_helper(int[] a){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int freq = 1;
        for(int k: a){
            if(!hm.containsKey(k)){
                hm.put(k, freq);
            }else{
                int p = hm.get(k);
                hm.put(k, p+1);
            }
        }
        return hm;
    }
    
    private static boolean Checker(int[] a, int[] b){
        if(a.length != b.length)
            return false;
        HashMap<Integer, Integer> hm_a = frequency_helper(a);
        HashMap<Integer, Integer> hm_b = frequency_helper(b);
        for(Entry<Integer, Integer> e: hm_a.entrySet()){
            if(hm_b.containsKey(e.getKey())){
                if(hm_a.get(e.getKey()) == hm_b.get(e.getKey()));
                else
                    return false;
            }else
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        int[] a = new int[]{2,5,6,8,10,2,2};
        int[] b = new int[]{2,3,10,8,6,5,2};
        System.out.println(Checker(a, b));
    }
    
}
