/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class D_Stacks_Using_Queue<T>
{
    private Queue< T > Q1 = new LinkedList< T >();
    private Queue< T > Q2 = new LinkedList< T >();
    
    private void push(T data){
        if(Q1.isEmpty()){
            Q2.offer(data);
        }else
            Q1.offer(data);
    }
    
    private T pop(){
        if(Q1.isEmpty()){
            int size = Q2.size();
            while(size-- > 1){
                Q1.offer(Q2.poll());
            }return Q2.poll();
        }else{
            int size = Q1.size();
            while(size-- > 1){
                Q2.offer(Q1.poll());
            }return Q1.poll();
        }
    }
    
    public static void main(String[] args)
    {
        D_Stacks_Using_Queue s = new D_Stacks_Using_Queue();
        s.push('a');
        s.push(1);
        s.push(4);
        s.push(6);
        s.push('z');
        System.out.println(s.pop());
    }
    
}
