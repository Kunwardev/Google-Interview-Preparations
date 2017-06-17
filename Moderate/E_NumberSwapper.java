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
class swapper{
    int a, b;
}

public class E_NumberSwapper
{
    private void swap(swapper x){
        x.a = x.a ^ x.b;
        x.b = x.a ^ x.b;
        x.a = x.a ^ x.b;
    }
    
    public static void main(String[] args)
    {
        swapper s = new swapper();
        s.a = 10;s.b = 15;
        E_NumberSwapper e = new E_NumberSwapper();
        System.out.println(s.a + " " + s.b);
        e.swap(s);
        System.out.println(s.a + " " + s.b);
    }
    
}
