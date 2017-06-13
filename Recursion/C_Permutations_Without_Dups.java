/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class C_Permutations_Without_Dups
{
    private ArrayList<String> getPerm(String str){
        if(str == null)
            return null;
        ArrayList<String> al = new ArrayList<>();
        if(str.length() == 0){
            al.add("");
            return al;
        }
        
        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = getPerm(remainder);
        for(String s: words){
            for(int j=0;j<=s.length();j++){
                String p = insertCharAt(s, first, j);
                al.add(p);
            }
        }
        return al;
    }

    private String insertCharAt(String s, char first, int j)
    {
        String start = s.substring(0, j);
        String end = s.substring(j);
        return start + first + end;
    }
    
    public static void main(String[] args)
    {
        String a = "helo";
        C_Permutations_Without_Dups c = new C_Permutations_Without_Dups();
        System.out.println(c.getPerm(a));
    }
    
}
