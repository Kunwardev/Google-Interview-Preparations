/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hard;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class E_Letters_Numbers
{
    private char[] findLongestSubarray(char[] array){
        int[] deltas = computeDeltaArrays(array);
        int[] match = findLongestMatch(deltas);
        return extract(array, match[0]+1, match[1]);
    }
    
    private char[] extract(char[] array, int start, int end){
        char[] subarray = new char[end-start+1];
        for(int i=start;i<=end;i++)
            subarray[i-start] = array[i];
        return subarray;
    }
    
    private int[] computeDeltaArrays(char[] array){
        int[] deltas = new int[array.length];
        int[] match = new int[array.length];
        int delta = 0;
        for(int i=0;i<array.length;i++){
            if(Character.isLetter(array[i]))
                delta++;
            else if(Character.isDigit(array[i]))
                delta--;
            deltas[i] = delta;
        }
        return deltas;
    }
    
    private int[] findLongestMatch(int[] deltas){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0, -1);
        int[] max = new int[2];
        for(int i=0;i<deltas.length;i++){
            if(!hm.containsKey(deltas[i]))
                hm.put(deltas[i], i);
            else{
                int match = hm.get(deltas[i]);
                int distance = i - match;
                int longest = max[1] - max[0];
                if(distance > longest){
                    max[1] = i;
                    max[0] = match;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        E_Letters_Numbers e = new E_Letters_Numbers();
        char[] array = "aaaa11a11aa1aa1aaaaa".toCharArray();
        char[] result = e.findLongestSubarray(array);
        for(char c: result)
            System.out.print(c);
    }
    
}
