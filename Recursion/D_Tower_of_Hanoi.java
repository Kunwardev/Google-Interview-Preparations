/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author Kunwar
 */
public class D_Tower_of_Hanoi
{
    private static void removeDisk(int n, char source, char aux, char dest){
        if(n == 1){
            System.out.println("Move Disk 1 from "+source+" to "+dest);
            return;
        }
        removeDisk(n-1, source, dest, aux);
        System.out.println("Move Disk "+n+" from "+source+" to "+dest);
        removeDisk(n-1, aux, source, dest);
    }
    
    public static void main(String[] args)
    {
        removeDisk(3, 'A', 'B', 'C');
    }
    
}
