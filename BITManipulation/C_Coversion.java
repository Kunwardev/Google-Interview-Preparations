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
public class C_Coversion
{
    private void convert(int x,int y){
        int p = Integer.bitCount(x^y);
        System.out.println("The Number of Bytes to flip from "+x+" to "+y+" are: "+p);
    }
    
    public static void main(String[] args)
    {
        C_Coversion c = new C_Coversion();
        c.convert(29, 15);
    }
    
}
