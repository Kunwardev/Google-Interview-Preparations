/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class D_Queue_Using_Stack<T>
{
    private Stack<T> s1 = new Stack<>();
    private Stack<T> s2 = new Stack<>();
    
    private void enque(T data){
        s1.push(data);
    }
    
    private T deque(){
        if(s2.empty())
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        return s2.pop();
    }
    
    public static void main(String[] args)
    {
        D_Queue_Using_Stack d = new D_Queue_Using_Stack();
        d.enque(1);
        d.enque(4);
        d.enque('a');
        d.enque(5);
        System.out.println(d.deque());
    }
    
}
