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
public class D_All_Pairs_With_Sum_S
{
    private static void printPairs(int[] arr, int sums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr){
            hm.put(i, i);
        }
        for(int j: arr){
            if(hm.containsValue(sums - j)){
                System.out.println("{ "+j+", "+(sums-j)+" }");
                hm.remove(j);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6};
        printPairs(arr, 7);
    }
    
}
