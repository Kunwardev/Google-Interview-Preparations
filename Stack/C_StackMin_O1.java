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
public class C_StackMin_O1
{
    
    private Stack<Integer> st = new Stack<Integer>();
    private int mins = 999;
    
    private void push(int data){
        if(data <= mins){
            st.push(2*data - mins);
            mins = data;
        }else
            st.push(data);
    }
    
    private int pop(){
        int p = st.pop();
        if(p < mins){
            mins = 2 * mins - p;
        }
        return p;
    }
    
    
    public static void main(String[] args)
    {
        C_StackMin_O1 c = new C_StackMin_O1();
        c.push(1);
        c.push(5);
        c.push(8);
        c.push(-1);
        c.pop();
        System.out.println(c.mins);
    }
    
}
