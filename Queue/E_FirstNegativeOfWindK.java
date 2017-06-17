/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class E_FirstNegativeOfWindK
{
    private void window(int[] arr, int k){
        Deque<Integer> di = new LinkedList<>();
        int i, length = arr.length;
        for(i=0;i<k;i++){
            if(arr[i] < 0)
                di.addLast(i);
        }
        System.out.println(di);
        for(;i<length;i++){
            
            if(!di.isEmpty()){
                System.out.println(arr[di.peekFirst()]);
            }else
                System.out.println(0);
            
            while((!di.isEmpty() && di.peekFirst() < (i-k+1)))
                di.pollFirst();
            if(arr[i] < 0)
                di.offerLast(i);
        }
        
        if(!di.isEmpty()){
            System.out.println(arr[di.peekFirst()]);
        }
        else
            System.out.println(0);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        E_FirstNegativeOfWindK e = new E_FirstNegativeOfWindK();
        e.window(arr, 3);
    }
    
}
