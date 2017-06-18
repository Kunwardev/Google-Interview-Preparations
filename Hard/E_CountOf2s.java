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
public class E_CountOf2s
{
    private int count2sInRangeAtDigit(int number, int d){
        int powerOf10 = (int)Math.pow(10, d);
        int nextPowerOf10 = powerOf10 * 10;
        int right = number % powerOf10;
        
        int roundDown = number - number % nextPowerOf10;
        int roundUp = number + nextPowerOf10;
        int digit = ( number/powerOf10 ) % 10;
        if(digit < 2)
            return roundDown/10;
        else if(digit == 2)
            return (roundDown/10 + right + 1);
        else
            return roundUp/10;
    }
    
    private int count2sInRange(int number){
        int count = 0;
        int len = String.valueOf(number).length();
        for(int digit = 0; digit < len ; digit++){
            count += count2sInRangeAtDigit(number, digit);
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        E_CountOf2s e = new E_CountOf2s();
        System.out.println(e.count2sInRange(1200));
    }
    
}
