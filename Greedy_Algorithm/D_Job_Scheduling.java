/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Kunwar
 */
public class D_Job_Scheduling
{
    private void findJobs(Job_ID[] j) {
        CompareJob_ID com = new CompareJob_ID();
        Arrays.sort(j, com);
        for(int i=0;i<j.length;i++){
            System.out.println(j[i].profit);
        }
        System.out.println("Jobs to be considered");
        System.out.println(j[0].id);
        int l = 0;
        for(int i=1;i<j.length;i++){
            if(j[l].deadline < j[i].deadline){
                System.out.println(j[i].id);
                l = i;
            }
        }
    }
    
    public static void main(String[] args)
    {
        D_Job_Scheduling s = new D_Job_Scheduling();
        Job_ID[] j = new Job_ID[4];
        j[0] = new Job_ID(1,100, 2);
        j[1] = new Job_ID(2, 150, 1);
        j[2] = new Job_ID(3, 15, 4);
        j[3] = new Job_ID(4, 200, 2);
        s.findJobs(j);
    }
    
}
