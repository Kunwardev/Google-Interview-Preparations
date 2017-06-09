/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy_Algorithm;

import java.util.Comparator;

/**
 *
 * @author Kunwar
 */
public class CompareKnapsack implements Comparator<D_FractionalItem>
{

    public int compare(D_FractionalItem o1, D_FractionalItem o2)
    {
        return o2.price - o1.price;
    }
    
}
