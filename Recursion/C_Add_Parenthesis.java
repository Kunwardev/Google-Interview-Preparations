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
public class C_Add_Parenthesis
{
    private void addParenthesis(ArrayList<String> al, int left, int right, char[] str, int count){
        if(left < 0 || right < left){
            return;
        }
        if(left == 0 && right == 0){
            String s = String.copyValueOf(str);
            al.add(s);
        }else{
            if(left > 0){
                str[count] = '(';
                addParenthesis(al, left-1, right, str, count+1);
            }
            if(right > left){
                str[count] = ')';
                addParenthesis(al, left, right-1, str, count+1);
            }
        }
    }
    
    private ArrayList<String> generateParenthesis(int count){
        char[] str = new char[2*count];
        ArrayList<String> list = new ArrayList<>();
        addParenthesis(list, count, count, str, 0);
        return list;
    }
    
    
    public static void main(String[] args)
    {
        int count = 3;
        ArrayList<String> al = new ArrayList<>();
        C_Add_Parenthesis c = new C_Add_Parenthesis();
        al = c.generateParenthesis(count);
        System.out.println(al);
    }
    
}
