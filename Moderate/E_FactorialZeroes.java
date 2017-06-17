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
public class E_FactorialZeroes
{
    private int numberOfZeroes(int x){
        int i = 5, count = 0;
        for(;x/i > 0;i*=5){
            count += x/i;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        E_FactorialZeroes e = new E_FactorialZeroes();
        System.out.println(e.numberOfZeroes(10));
    }
    
}
