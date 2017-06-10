/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

/**
 *
 * @author Kunwar
 */
public class D_Fibonacci
{
    int[] fibo = new int[101];
    private int function(int n){
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        if(fibo[n] > 0)
            return fibo[n];
        else
            fibo[n] = function(n-1)+function(n-2);
        return fibo[n];
    }
    
    public static void main(String[] args)
    {
        D_Fibonacci d = new D_Fibonacci();
        System.out.println(d.function(6));
                
    }
    
}
