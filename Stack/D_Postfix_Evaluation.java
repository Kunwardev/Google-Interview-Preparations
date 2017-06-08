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
public class D_Postfix_Evaluation
{
    private static int function(String[] x){
        Stack<Integer> st = new Stack<>();
        for(String token: x){
            if(token.equals("+")){
                int op1 = st.pop();
                int op2 = st.pop();
                int res = op1 + op2;
                st.push(res);
            }else if(token.equals("-")){
                int op1 = st.pop();
                int op2 = st.pop();
                int res = op2 - op1;
                st.push(res);
            }else if(token.equals("*")){
                int op1 = st.pop();
                int op2 = st.pop();
                int res = op1 * op2;
                st.push(res);
            }else if(token.equals("/")){
                int op1 = st.pop();
                int op2 = st.pop();
                int res = op1 / op2;
                st.push(res);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
    
    public static void main(String[] args)
    {
        String[] x = new String[]{"1","2","3","*","+","5","-"};
        System.out.println(function(x));
    }
    
}
