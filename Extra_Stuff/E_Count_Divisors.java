/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Extra_Stuff;

/**
 *
 * @author Kunwar
 */
public class E_Count_Divisors
{
    private int findLCM(int a, int b){
        return (a * b)/gcd(a, b);
    }
    
    private int rangeDivisors(int m, int n, int a, int b){
        int a_divisor = (n/a)-((m-1)/a);
        int b_divisor = (n/b)-((m-1)/b);
        int lcm = findLCM(a, b);
        lcm = (n/lcm) - ((m-1)/lcm);
        return (a_divisor+b_divisor-lcm);
    }

    private int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
    
    public static void main(String[] args)
    {
        int n = 11, m = 3, a = 3, b = 2;
        E_Count_Divisors e = new E_Count_Divisors();
        System.out.println(e.rangeDivisors(m, n, a, b));
    }
    
}
