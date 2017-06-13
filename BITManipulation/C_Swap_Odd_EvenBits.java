/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BITManipulation;

/**
 *
 * @author Kunwar
 */
public class C_Swap_Odd_EvenBits
{
    private int swapBits(int x){
        return (((x & 0xaaaaaaaa)>>>1)|((x & 0x55555555)<<1));
    }
    
    public static void main(String[] args)
    {
        C_Swap_Odd_EvenBits c = new C_Swap_Odd_EvenBits();
        System.out.println(c.swapBits(13));
    }
    
}
