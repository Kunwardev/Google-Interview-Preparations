/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Kunwar
 */
public class E_WordBreak
{
    public boolean wordBreak(String s, ArrayList<String> dict){
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;
        for(int i=0;i<s.length();i++){
            if(!t[i])
                continue;
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
                if(s.substring(i, end).equals(a))
                    t[end] = true;
            }
        }
        return t[s.length()];
    }
    
    public static void main(String[] args)
    {
        String a = "leetcode";
        ArrayList<String> p = new ArrayList<>();
        p.add("leet");
        p.add("code");
        E_WordBreak e = new E_WordBreak();
        System.out.println(e.wordBreak(a, p));
    }
    
}
