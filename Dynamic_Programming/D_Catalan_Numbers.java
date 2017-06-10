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
public class D_Catalan_Numbers
{
    private int catalanNumber(int x){
        int[] table = new int[x+1];
        table[0] = table[1] = 1;
        for(int i=2;i<=x;i++){
            table[i] = 0;
            for(int j=0;j<i;j++){
                table[i] += (table[j]*table[i-j-1]);
            }
        }
        return table[x];
    }
    
    public static void main(String[] args)
    {
        D_Catalan_Numbers d = new D_Catalan_Numbers();
        System.out.println(d.catalanNumber(3));
    }
    
}
