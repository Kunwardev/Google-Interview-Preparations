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
public class C_Insertion
{
    private int updateBits(int n, int m, int i, int j){
        int allOnes = ~0;
        int left = allOnes << (j+1);
        int right = ((1<<i)-1);
        int mask = left | right;
        int n_cleared = n & mask;
        int m_shifted = m << i;
        return(n_cleared | m_shifted);
    }
    
    public static void main(String[] args)
    {
        int n = 1024;
        int m = 19;
        int i = 2, j = 6;
        C_Insertion c = new C_Insertion();
        System.out.println(c.updateBits(n, m, 2, 6));
    }
    
}
