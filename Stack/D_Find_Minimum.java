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
public class D_Find_Minimum
{
    private static Stack<Integer> st;
    private static Stack<Integer> min;
    
    private static void add(int[] arr){
        st = new Stack<>();
        min = new Stack<>();
        int mins = Integer.MAX_VALUE;
        for(int i: arr){
            st.push(i);
            if(mins > i){
                mins = i;
                min.push(mins);
            }
        }
    }
    
    private static void pops(){
        int p = st.pop();
        if(p == min.peek()){
            min.pop();
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,1,4,6,2};
        add(arr);
        System.out.println(st);
        System.out.println(min);
        pops();
        System.out.println(st);
        System.out.println(min);
    }
    
}
