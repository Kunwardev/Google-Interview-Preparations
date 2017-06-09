/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy_Algorithm;

/**
 *
 * @author Kunwar
 */
public class D_Coin_Change
{
    int[] change = new int[]{1,2,5,10,50,100,500,1000};
    
    private void changes(int x){
        for(int i=change.length-1;i>=0 && x!=0;i--){
            if(x > change[i]){
                System.out.println(x/change[i]+" "+change[i]);
                x = x%change[i];
            }
        }
    }
    
    public static void main(String[] args)
    {
        D_Coin_Change c = new D_Coin_Change();
        c.changes(49);
    }
    
}
