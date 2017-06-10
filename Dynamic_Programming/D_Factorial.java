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
public class D_Factorial
{
    int[] fact = new int[21];
    private int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        if(fact[n] > 0)
            return fact[n];
        return fact[n] = n*factorial(n-1);
    }
    
    public static void main(String[] args)
    {
        int x = 10;
        D_Factorial d = new D_Factorial();
        System.out.println(d.factorial(x));
    }
    
}
