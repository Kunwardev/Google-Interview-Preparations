/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hard;

/**
 *
 * @author Kunwar
 */
public class E_RandomSet
{
    private int[] pickM(int[] original, int m){
        int[] subset = new int[m];
        for(int i=0;i<m;i++)
            subset[i] = original[i];
        
        for(int i = m; i < original.length; i++){
            int k = rand(0, i);
            if(k < m)
                subset[k] = original[i];
        }
        return subset;
    }

    private int rand(int i, int m)
    {
        return (int)(i + (Math.random()*(m-i+1)));
    }
    
    public static void main(String[] args)
    {
        E_RandomSet e = new E_RandomSet();
        int[] original = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] result = e.pickM(original, 5);
        for(int k: result)
            System.out.print(k+" ");
    }
    
}
