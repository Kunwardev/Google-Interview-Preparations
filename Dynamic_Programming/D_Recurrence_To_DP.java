/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

/**
 *
 * @author Kunwar
 */
public class D_Recurrence_To_DP
{
    // T(0) = T(1) = 2
    // T(n) = SUM(2*T(i-1)*T(i))
    int[] T = new int[18];
    private int function(int n){
        if(n == 0 || n == 1)
            return 2;
        else{
            if(T[n] > 0)
                return T[n];
            for(int i=1;i<n;i++){
                T[n] += (2*function(i)*function(i-1));
            }
        }
        return T[n];
    }
    
    public static void main(String[] args)
    {
        D_Recurrence_To_DP d = new D_Recurrence_To_DP();
        System.out.println(d.function(4));
    }
    
}
