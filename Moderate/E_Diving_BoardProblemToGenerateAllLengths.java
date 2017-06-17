/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class E_Diving_BoardProblemToGenerateAllLengths
{
//    private HashSet<Integer> all_Lengths(int k, int shorter, int larger){
//        HashSet<Integer> lengths = getAllLengths(k, shorter, larger);
//        return lengths;
//    }
    
    private HashSet<Integer> getAllLengths(int k, int shorter, int larger){
        HashSet<Integer> lengths = new HashSet<>();
        for(int nShorter = 0; nShorter <= k; nShorter++){
            int nLonger = k - nShorter;
            int length = nShorter * shorter + nLonger * larger;
            lengths.add(length);
        }
        return lengths;
    }
    
    public static void main(String[] args)
    {
        E_Diving_BoardProblemToGenerateAllLengths e = new E_Diving_BoardProblemToGenerateAllLengths();
        System.out.println(e.getAllLengths(3, 4, 2));
    }
    
}
