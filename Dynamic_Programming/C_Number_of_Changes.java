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
public class C_Number_of_Changes
{
    private int makeChange(int n){
        int[] denoms = new int[]{25, 10, 5, 1};
        int[][] map = new int[n+1][denoms.length];
        return makeChange(n, denoms, 0, map);
    }

    private int makeChange(int n, int[] denoms, int i, int[][] map)
    {
        if(map[n][i] > 0)
            return map[n][i];
        if(i >= denoms.length-1)
            return 1;
        int denomAmount = denoms[i];
        int ways = 0;
        for(int p=0;p*denomAmount <= n;p++){
            int amountRemaining = n - p * denomAmount;
            ways += makeChange(n, denoms, i+1, map);
        }
        map[n][i] = ways;
        return ways;
    }
    
    public static void main(String[] args)
    {
        int amount = 100;
        C_Number_of_Changes c = new C_Number_of_Changes();
        System.out.println(c.makeChange(amount));
    }
    
}
