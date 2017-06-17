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
public class OperationsWithOnlyAdd
{
    private int negate(int x){
        return (~x + 1);
    }
    
    private int add(int a, int b){
        return (a + b);
    }
    
    private int subtract(int a, int b){
        return (a + (negate(b)));
    }
    
    private int multiply(int a, int b){
        int min = a > b ? b:a;
        boolean flag = false;
        int p = a;
        if(min == 0)
            return 0;
        if(min < 0){
            min = -min;
            flag = true;
        }
        while(min > 1){
            a += p;
            min--;
        }
        if(flag)
            a = -a;
        return a;
    }
    
    private int divide(int a, int b){
        if(b == 0)
            throw new ArithmeticException("ERROR");
        int absa = Math.abs(a);
        int absb = Math.abs(b);
        
        int product = 0;
        int x = 0;
        while(product + absb <= absa){
            product += absb;
            x++;
        }
        if((a < 0 && b < 0) || (a > 0 && b > 0))
            return x;
        else
            return negate(x);
    }
    
    public static void main(String[] args)
    {
        int a = 100;
        OperationsWithOnlyAdd e = new OperationsWithOnlyAdd();
        System.out.println(e.divide(45, 3));
    }
    
}
