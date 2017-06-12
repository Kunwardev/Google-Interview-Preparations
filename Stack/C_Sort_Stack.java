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
public class C_Sort_Stack
{
    private void sort(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp = st.pop();
            sort(st);
            sortInsert(st, temp);
        }
    }

    private void sortInsert(Stack<Integer> st, int data)
    {
        if(st.isEmpty() || st.peek() < data){
            st.push(data);
        }else{
            int temp = st.pop();
            sortInsert(st, data);
            st.push(temp);
        }
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(8);
        st.push(2);
        st.push(6);
        st.push(10);
        System.out.println(st);
        C_Sort_Stack c = new C_Sort_Stack();
        c.sort(st);
        System.out.println(st);
    }
    
}
