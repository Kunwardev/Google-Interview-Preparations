/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class E_Length_Of_Longest_Substring
{
    private int function(String st){
        int count = 0;
        int i = 0;
        while(st.charAt(i) == ')')
            i++;
        Stack<Character> str = new Stack<Character>();
        for(;i<st.length();i++){
            if(st.charAt(i) == '(')
                str.push('(');
            else{
                if(!str.isEmpty()){
                    str.pop();
                    count+=2;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        String st = ")()())";
        E_Length_Of_Longest_Substring e = new E_Length_Of_Longest_Substring();
        System.out.println(e.function(st));
    }
    
}
