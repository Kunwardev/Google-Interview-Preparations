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
public class D_KString
{
    private static void KString(char[]a, int k,int n){
        if(n == 0){
            for(char c: a)
                System.out.print(c);
            System.out.println();
        }else{
            for(int j=0;j<k;j++){
                a[n-1] = (char) (j+'0');
                KString(a, k, n-1);
            }
        }
    }
    
    public static void main(String[] args)
    {
        char[]a = new char[3];
        KString(a, 3, 3);
    }
    
}
