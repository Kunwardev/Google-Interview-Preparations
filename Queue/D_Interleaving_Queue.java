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
public class D_Interleaving_Queue
{
    private static Queue<Integer> interleave(Queue<Integer> q){
        if(q.size() % 2 != 0)
            throw new IllegalArgumentException();
        Queue<Integer> main = new LinkedList<>();
        Queue<Integer> st = new LinkedList<Integer>();
        for(int o=0;o<=q.size()/2+1;o++){
            st.offer(q.poll());
        }
        boolean first = true;
        while(!q.isEmpty()){
            if(first){
                main.offer(st.poll());
            }else
                main.offer(q.poll());
            first = !first;
        }
        return main;
    }
    
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i=11;i<=20;i++){
            q.offer(i);
        }
        System.out.println(q);
        q = interleave(q);
        System.out.println(q);
    }
    
}
