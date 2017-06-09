/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

/**
 *
 * @author Kunwar
 */
public class D_Brute_Force
{
    private static int bruteForce(String a, int n, String b, int m){
        for(int i=0;i<n-m;i++){
            int j = 0;
            while(j < m && a.charAt(i+j) == b.charAt(j))
                j++;
            if(j == b.length())
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        String a = "kunwardevsingh";
        String b = "vsin";
        System.out.println(bruteForce(a, a.length(), b, b.length()));
    }
    
}
