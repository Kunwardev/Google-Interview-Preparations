/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

/**
 *
 * @author Kunwar
 */
public class E_Find_Min_WithoutOperator
{
    
    // If positive, returns 0 else 1
    private int sign(int x){
        return ((x >> 31) & 0x1);
    }
    
    private int getMax(int a, int b){
        int c = -(Math.abs(b - a));         // If you remove the negative sign
        int sa = sign(a);                   // you will get min element
        int sb = sign(b);
        int sc = sign(c);
        
        int use_sign_of_a = sa ^ sb;
        int use_sign_of_c = flip(sa ^ sb);
        int k = use_sign_of_a * sa + use_sign_of_c * sc;
        int q = flip(k);
        return a * k + b * q;
    }

    private int flip(int k)
    {
        return (1^k);
    }
    
    public static void main(String[] args)
    {
        E_Find_Min_WithoutOperator e = new E_Find_Min_WithoutOperator();
        
        System.out.println(e.getMax(20, 17));
    }
    
}
