/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backtracking;

/**
 *
 * @author Kunwar
 */
public class BinaryString
{
    private static void Binary(char a[],int n){
        if(n == 0){
            for(char c: a)
                System.out.print(c);
            System.out.println();
            return;
        }
        a[n-1] = '1';
        Binary(a, n-1);
        a[n-1] = '0';
        Binary(a, n-1);
    }
    
    public static void main(String[] args)
    {
        char[] a = new char[3];
        Binary(a, 3);
    }
    
}
