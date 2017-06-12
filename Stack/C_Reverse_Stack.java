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
public class C_Reverse_Stack
{
    private void reverseStack(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp = st.pop();
            reverseStack(st);
            reverse(st, temp);
        }
    }

    private void reverse(Stack<Integer> st, int temp)
    {
        if(st.isEmpty()){
            st.push(temp);
        }else{
            int data = st.pop();
            reverse(st, temp);
            st.push(data);
        }
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);
        System.out.println(st);
        C_Reverse_Stack s = new C_Reverse_Stack();
        s.reverseStack(st);
        System.out.println(st);
    }
    
}
