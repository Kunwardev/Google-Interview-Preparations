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
public class D_Factorial
{
    private static int Factorial(int n){
        if(n <= 1){
            return 1;
        }else
            return (n*Factorial(n-1));
    }
    
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(Factorial(n));
    }
    
}
