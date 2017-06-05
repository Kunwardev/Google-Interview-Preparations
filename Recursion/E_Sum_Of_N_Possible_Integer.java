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
public class E_Sum_Of_N_Possible_Integer
{
   private static int power(int number, int n){
       if(n == 0)
           return 1;
       else if(n%2 == 0)
           return(power(number, n/2)*power(number,n/2));
       else
           return(number*(power(number, n/2)*power(number,n/2)));
   } 
   
   private static int checkRecursive(int x, int n, int current_num, int current_sum){
       int results = 0;
       int p = power(current_num, n);
       while(p + current_sum < x){
           results += checkRecursive(x, n, current_num+1, current_sum+p);
           current_num++;
           p = power(current_num, n);
       }
       
       if(p + current_sum == x){
           results++;
           System.out.println(p+" "+current_sum);
       }
       return results;
   }
   
   
    public static void main(String[] args)
    {
        int x = 10,n=2;
        System.out.println(checkRecursive(x, n, 1, 1));
    }
   
}
