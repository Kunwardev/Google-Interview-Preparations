/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hard;

import java.util.ArrayList;
import java.util.BitSet;

/**
 *
 * @author Kunwar
 */
public class E_Find_Missing
{
    private int findMissing(ArrayList<BitSet> al){
        throw new UnsupportedOperationException();
    }
    
    public static void main(String[] args)
    {
        BitSet a = new BitSet(20);
        BitSet b = new BitSet(20);
        for(int i=0;i<20;i++){
            if(i%2 == 0)
                a.set(i);
            if(i%5 == 0)
                b.set(i);
        }
        System.out.println(a);
        System.out.println(b);
        a.and(b);
        System.out.println(a);
        
    }
    
}
