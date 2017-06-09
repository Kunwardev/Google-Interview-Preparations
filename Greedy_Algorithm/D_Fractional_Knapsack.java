/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy_Algorithm;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class D_Fractional_Knapsack
{
    private void sort(D_FractionalItem[] d){
        CompareKnapsack c = new CompareKnapsack();
        Arrays.sort(d, c);
    }
    
    private double function(D_FractionalItem[] d, double W){
        int i = 0;double total_value = 0;
        while(W != 0){
            if(W >= d[i].weight){
                total_value += d[i].price;
                W -= d[i].weight;
            }else{
                double price = (double)((W/d[i].weight)*d[i].price);
                total_value += price;
                break;
            }
            if(i++ == d.length)
                break;
        }
        return total_value;
    }
    
    public static void main(String[] args)
    {
        D_Fractional_Knapsack s = new D_Fractional_Knapsack();
        D_FractionalItem[] d = new D_FractionalItem[3];
        d[0] = new D_FractionalItem(60, 10);
        d[1] = new D_FractionalItem(100, 20);
        d[2] = new D_FractionalItem(120, 30);
        s.sort(d);
        System.out.println(s.function(d, 7));
    }
    
}
