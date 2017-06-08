/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class D_Reversing_Queue
{
    private static Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        return q;
    }
    
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=6;i++){
            q.add(i);
        }
        System.out.println(q);
        q = reverseQueue(q);
        System.out.println(q);
    }
    
}
