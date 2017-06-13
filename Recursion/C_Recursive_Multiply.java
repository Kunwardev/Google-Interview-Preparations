/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author Kunwar
 */
public class C_Recursive_Multiply
{
    private int minProduct(int a, int b){
        int smaller = a < b ? a : b;
        int bigger = a > b ? a : b;
        return minProductHelper(smaller, bigger);
    }
    
    private int minProductHelper(int smaller, int bigger){
        if(smaller == 0)
            return 0;
        if(smaller == 1)
            return bigger;
        int s = smaller >> 1;
        int half = minProductHelper(s, bigger);
        if(smaller % 2 == 1){
            return half+half+bigger;
        }
        return half + half;
    }
    
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        C_Recursive_Multiply c = new C_Recursive_Multiply();
        System.out.println(c.minProduct(a, b));
    }
    
}
