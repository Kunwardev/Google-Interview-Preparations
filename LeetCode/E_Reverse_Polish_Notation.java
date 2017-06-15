/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class E_Reverse_Polish_Notation
{
    private int evaluate(String[] str){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<str.length;i++){
            if(!Character.isDigit(str[i].charAt(0))){
                int A, B;
                switch(str[i]){
                    case "+":
                        A = st.pop();
                        B = st.pop();
                        st.push(A+B);
                        break;
                    case "-":
                        A = st.pop();
                        B = st.pop();
                        st.push(B-A);
                        break;
                    case "*":
                        A = st.pop();
                        B = st.pop();
                        st.push(A*B);
                        break;
                    case "/":
                        A = st.pop();
                        B = st.pop();
                        st.push(B/A);
                        break;
                    
                }
            }else{
                st.push(Integer.parseInt(str[i]));
            }
        }
        return st.pop();
    }
    
    
    public static void main(String[] args)
    {
        String[] str = new String[]{"2","1","+","3","*"};
        E_Reverse_Polish_Notation e = new E_Reverse_Polish_Notation();
        System.out.println(e.evaluate(str));
    }
    
}
