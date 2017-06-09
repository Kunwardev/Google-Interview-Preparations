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
public class CompareJob_ID implements Comparator<Job_ID>
{
    public int compare(Job_ID o1, Job_ID o2)
    {
        if(o1.profit > o2.profit)
            return -1;
        else
            return 1;
    }
    
}
