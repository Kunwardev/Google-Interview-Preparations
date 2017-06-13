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
public class E_CountTiles
{
    // N X M Board to be filled with 1 X M Board
    private int countWays(int n, int m){
        int[] count = new int[n+1];
        count[0] = 0;
        for(int i=1;i<=n;i++){
            if(i > m)
                count[i] = count[i-1] + count[i-m];
            else if(i < m)
                count[i] = 1;
            else
                count[i] = 2;
        }
        return count[n];
    }
    
    public static void main(String[] args)
    {
        int n = 4, m = 4;
        E_CountTiles e = new E_CountTiles();
        System.out.println(e.countWays(n, m));
    }
    
}
