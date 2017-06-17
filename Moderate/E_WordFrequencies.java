/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class E_WordFrequencies
{
    private HashMap<String, Integer> getFreqRepetition(String[] book){
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word: book){
            word = word.toLowerCase();
            if(word.trim() != ""){
                if(!hm.containsKey(word))
                    hm.put(word, 0);
            hm.put(word, hm.get(word)+1);
            }
        }
        return hm;
    }
    
    private int getFreq(String[] book, String word){
        word = word.trim().toLowerCase();
        int count = 0;
        for(String w: book){
            if(w.trim().toLowerCase().equals(word))
                count++;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        String[] dict = new String[]{"hello","sdf","gfnfg","hello","dv","hello","dfb","hello"};
        E_WordFrequencies e = new E_WordFrequencies();
        System.out.println(e.getFreq(dict, "hello"));
        System.out.println(e.getFreqRepetition(dict));
    }
    
}
