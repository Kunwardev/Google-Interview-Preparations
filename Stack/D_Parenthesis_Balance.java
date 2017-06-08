/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class D_Parenthesis_Balance
{
    private static boolean check(String a){
        Stack<Character> st = new Stack<>();
        for(char x: a.toCharArray()){
            if(x ==')'){
                if(!st.isEmpty() && st.peek() == '(')
                    st.pop();
                else
                    return false;
            }
            else{
                st.push(x);
            }
        }
        return (st.isEmpty());
    }
    
    public static void main(String[] args)
    {
        String a = "(()()))";
        System.out.println(check(a));
    }
    
}
