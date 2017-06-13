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
public class E_Cutting_Rod
{
    private int cutCost(int[] price){
        int[] val = new int[price.length+1];
        val[0] = 0;
        for(int i=1;i<=price.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<i;j++)
                max = Math.max(max, price[j] + price[i-j-1]);
            val[i] = max;
        }
        return val[price.length];
    }
    
    public static void main(String[] args)
    {
        E_Cutting_Rod e = new E_Cutting_Rod();
        int[] arr = new int[]{0,1,5,8,9,10,17,17,20};
        System.out.println(e.cutCost(arr));
    }
    
}
