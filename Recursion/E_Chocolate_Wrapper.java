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
public class E_Chocolate_Wrapper
{
    private static int countRec(int choc, int wrap){
        if(choc < wrap)
            return 0;
        int newChoc = choc/wrap;
        return newChoc+countRec(newChoc + choc%wrap, wrap);
    }
    
    private static int countCost(int money, int price, int wrap){
        int choc = money/price;
        return choc + countRec(choc, wrap);
    }
    
    public static void main(String[] args)
    {
        int money = 15;
        int price = 1;
        int wrap = 3;
        System.out.println(countCost(money, price, wrap));
    }
    
}
