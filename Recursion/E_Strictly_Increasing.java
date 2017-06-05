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
public class E_Strictly_Increasing
{
    private static void function(int start, String a, int n){
        if(n == 0){
            System.out.print(a+" ");
            return;
        }
        for(int i=start;i<=9;i++){
            String str = a+i;
            function(i+1, str, n-1);
        }
    } 
    
    public static void main(String[] args)
    {
        function(0, "", 2);
    }
    
}
