/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
public class E_Power
{
    private double power(double x, int n){
        if(n == 0)
            return 1;
        double v = power(x, n/2);
        if(n%2 == 0)
            return v * v;
        else
            return v * v * x;
    }
    
    public static void main(String[] args)
    {
        E_Power e = new E_Power();
        System.out.println(e.power(4, 3));
    }
    
}
