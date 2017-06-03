/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class Find_Sum_From_Different_Arrays
{
    private static boolean check(int[] a, int[] b, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i: a)
            hm.put(i, i);
        for(int j: b){
            if(hm.containsValue(k-j))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,3,4,3,2,1};
        int[] b = new int[]{5,4,3,2,1};
        System.out.println(check(a, b, 10));
    }
    
}
