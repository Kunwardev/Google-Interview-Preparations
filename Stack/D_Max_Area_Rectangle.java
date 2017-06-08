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
public class D_Max_Area_Rectangle
{
    private static int maxRectangle(int[] arr){
        Stack<Integer> st = new Stack<Integer>();
        if(arr == null || arr.length == 0)
            return 0;
        int i=0,maxArea = 0;
        while(i < arr.length){
            if(st.isEmpty() || arr[st.peek()] <= arr[i]){
                st.push(i++);
            }else{
                int top = st.pop();
                maxArea = Math.max(maxArea, arr[top]*(st.isEmpty()?i:i-st.peek()-1));
            }
        }
        while(!st.isEmpty()){
            int top = st.pop();
            maxArea = Math.max(maxArea, arr[top]*(st.isEmpty()?i:i-st.peek()-1));
        }
        return maxArea;
    }
    
    public static void main(String[] args)
    {
        int[] hist = new int[]{2,1,4,5,1};
        System.out.println(maxRectangle(hist));
    }
    
}
