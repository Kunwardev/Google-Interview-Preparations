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
public class E_MinCoinsChange
{
    private int getChange(int[] coins, int amount){
        int[][] arr = new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++)
            arr[i][0] = 0;
        
        for(int i=0;i<=amount;i++)
            arr[0][i] = 0;
        
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1] <= j){
//                    System.out.println(j-coins[i-1]);
                    if(i != 1)
                    arr[i][j] = Math.min(arr[i][j-coins[i-1]]+1,arr[i-1][j]);
                    else
                        arr[i][j] = arr[i][j-coins[i-1]]+1;
//                    System.out.println(arr[i][j]);
                }else{
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        
        
        for(int i=0;i<=coins.length;i++){
            for(int j=0;j<=amount;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        
        return arr[coins.length][amount];
    }
    
    public static void main(String[] args)
    {
        int[] coins = new int[]{1,5,6,8};
        int amount = 11;
        E_MinCoinsChange e = new E_MinCoinsChange();
        System.out.println(e.getChange(coins, amount));
    }
    
}
