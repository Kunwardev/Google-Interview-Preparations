/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

/**
 *
 * @author Kunwar
 */
class Result{
    int hits = 0, pseudohits = 0;
    
    public String toString(){
        return "( hits: "+hits+" "+" pseudohits: "+pseudohits+" )";
    }
    
}

public class E_Master_Mind
{
    int MAX_COLORS = 4;
    private int code(char x){
        switch(x){
            case 'B':
                return 0;
            case 'G':
                return 1;
            case 'R':
                return 2;
            case 'Y':
                return 3;
            default:
                return -1;
        }
    }
    
    private Result estimate(String guess, String actual){
        if(guess.length() != actual.length())
            return null;
        Result res = new Result();
        int[] freq = new int[MAX_COLORS];
        // For Computing Hits
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i) == actual.charAt(i))
                res.hits++;
            else{
                int code = code(actual.charAt(i));
                freq[code]++;
            }
        }
        
        // For Computing PseudoHits
        for(int i=0;i<guess.length();i++){
            int code = code(guess.charAt(i));
            if(code >= 0 && freq[code] > 0 && guess.charAt(i) != actual.charAt(i)){
                res.pseudohits++;
                freq[code]--;
            }
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        String actual = "RGBY";
        String guess = "GGRR";
        E_Master_Mind e = new E_Master_Mind();
        System.out.println(e.estimate(guess, actual));
    }
    
}
