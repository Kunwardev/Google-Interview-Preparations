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
public class D_Stack_Reversal
{
    private static void reverseStack(Stack<Integer> st){
        if(st.isEmpty())
            return;
        int temp = st.pop();
        reverseStack(st);
        insertAtBottom(st, temp);
    }

    private static void insertAtBottom(Stack<Integer> st, int data)
    {
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int temp = st.pop();
        insertAtBottom(st, data);
        st.push(temp);
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=10;i++){
            st.push(i);
        }
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
    
}
