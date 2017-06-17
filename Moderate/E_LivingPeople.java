/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

/**
 *
 * @author Kunwar
 */
public class E_LivingPeople
{
    private int maxYearAlive(int[] births, int[] deaths, int min){
        int birthIndex = 0;
        int deathIndex = 0;
        int currentlyAlive = 0;
        int maxAlive = 0;
        int maxAliveYear = min;
        
        while(birthIndex < births.length){
            if(births[birthIndex] <= deaths[deathIndex]){
                currentlyAlive++;
                if(currentlyAlive > maxAlive){
                    maxAlive = currentlyAlive;
                    maxAliveYear = births[birthIndex];
                }
                birthIndex++;
            }else{
                currentlyAlive--;
                deathIndex++;
            }
        }
        System.out.println(maxAlive);
        return maxAliveYear;
    }
    
    public static void main(String[] args)
    {
        int[] births = new int[]{12,20,10,1,10,23,13,90,83,75};
        int[] deaths = new int[]{15,90,98,72,98,82,98,98,99,94};
        E_LivingPeople e = new E_LivingPeople();
        System.out.println(e.maxYearAlive(births, deaths, Integer.MAX_VALUE));
    }
    
}
