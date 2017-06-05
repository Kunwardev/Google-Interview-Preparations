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
public class E_Digits_WO_Consecutive_One
{
    private static void Generate(int length, char[] s, int k){
        if(k == length){
            for(char p: s){
                System.out.print(p);
            }
            System.out.println();
            return;
        }
        if(s[k-1] == '1'){
            s[k] = '0';
            Generate(length, s, k+1);
        }else{
            s[k] = '1';
            Generate(length, s, k+1);
            s[k] = '0';
            Generate(length, s, k+1);
        }
    }
    
    public static void main(String[] args)
    {
        char[] s = new char[3];
        s[0] = '0';
        Generate(3, s, 1);
        s[0] = '1';
        Generate(3, s, 1);
    }
    
}
