/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Kunwar
 */
public class D_First_Repeated
{
    private static int repeated(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int p = hm.get(arr[i]);
                p = -p;
                hm.put(arr[i], p);
            }else{
                hm.put(arr[i], i+1);
            }
        }
        System.out.println(hm);
        int index = Integer.MIN_VALUE,number = 0;
        for(Entry<Integer, Integer> e:hm.entrySet()){
            if(index < e.getValue()){
                if(e.getValue() < 0){
                index = e.getValue();
                number = e.getKey();
                }
            }
        }
        return number;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,1,2};
        System.out.println(repeated(arr));
    }
    
}
