/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Kunwar
 */
public class D_Remove_Duplicates
{
    // Character Array
    private static void removeDuplicates(char[] s){
        int src, dest;
        Hashtable<Character, Integer> h = new Hashtable<>();
        int current = 0, last = 0;
        for(;s[current] != '\0';current++){
            if(!h.containsKey(s[current])){
                s[last++] = s[current];
                h.put(s[current], 1);
            }
        }
        s[last] = '\0';
        for(int i=0;i<last;i++){
            System.out.print(s[i]+" ");
        }
    }
    
    // String
    private static String removeDuplicates(String s){
        StringBuffer dup = new StringBuffer();
        HashMap<Character, Integer> h = new HashMap<>();
        for(char c: s.toCharArray()){
            if(!h.containsKey(c)){
                dup.append(c);
                h.put(c, 1);
            }
        }
        
        return dup.toString();
    }
    
    public static void main(String[] args)
    {
        char[] s = new char[]{'h','e','l','l','o','\0'};
        removeDuplicates(s);
        String st = "hello";
        System.out.println(removeDuplicates(st));
    }
    
}
