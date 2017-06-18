/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hard;

/**
 *
 * @author Kunwar
 */
public class E_AddWOOperator
{
    private int Add(int a, int b){
        if(b == 0)
            return a;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        System.out.println(sum+" "+carry);
        return Add(sum, carry);
    }
    
    public static void main(String[] args)
    {
        int a = 11, b = 5;
        E_AddWOOperator e = new E_AddWOOperator();
        e.Add(a, b);
    }
    
}
