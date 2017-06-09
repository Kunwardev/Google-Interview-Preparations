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
public class D_KMP
{
    static int[] F;
    private static void Prefix_Table(char[] P, int m){
        F = new int[P.length];
        int i = 1,j=0;
        F[0] = 0;
        while(i < m){
            if(P[i] == P[j]){
                F[i] = j+1;
                i++;j++;
            }else if(j > 0)
                j = F[j-1];
            else{
                F[i] = 0;
                i++;
            }
        }
    }
    
    private static int matching(char[]T, int n,char[] P, int m){
        int i=0,j=0;
        Prefix_Table(P, m);
        while(i < n){
            if(T[i] == P[j]){
                if(j == m-1)
                    return i-j;
                else{
                    i++;j++;
                }
            }else if(j > 0)
                j = F[j-1];
            else
                i++;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        char[]pattern = "ababaca".toCharArray();
        char[]text = "bacbabababacaca".toCharArray();
        System.out.println(matching(text, text.length, pattern, pattern.length));
    }
    
}
