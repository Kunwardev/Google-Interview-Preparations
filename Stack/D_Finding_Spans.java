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
public class D_Finding_Spans
{
    private static int[] findSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] spans = new int[arr.length];
        int p = 0;
        for(int i =0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                st.pop();
            }
            spans[i] = (st.isEmpty()) ? i+1 : i-st.peek();
            st.push(i);
        }
        return spans;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{6,3,4,5,2};
        int[] spans = findSpan(arr);
        for(int i=0;i<spans.length;i++){
            System.out.print(spans[i]+" ");
        }
    }
    
}
