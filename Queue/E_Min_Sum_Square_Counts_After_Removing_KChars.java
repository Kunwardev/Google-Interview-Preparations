/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */
public class E_Min_Sum_Square_Counts_After_Removing_KChars
{
    private void countFreq(String str, int[] freq){
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
    }
    
    private int minStringValue(String str, int k){
        int length = str.length();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] freq = new int[26];
        countFreq(str, freq);
        for(int i=0;i<26;i++)
            pq.add(freq[i]);
        for(int i=0;i<k;i++)
        {
            int temp = pq.poll();
            pq.offer(temp - 1);
        }
        int sum = 0;
        while(!pq.isEmpty()){
            int temp = pq.poll();
            sum += (temp*temp);
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        String a = "aaab";
        E_Min_Sum_Square_Counts_After_Removing_KChars e = new E_Min_Sum_Square_Counts_After_Removing_KChars();
        System.out.println(e.minStringValue(a, 2));
    }
    
}
