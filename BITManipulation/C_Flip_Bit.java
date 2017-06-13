/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BITManipulation;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class C_Flip_Bit
{
    private int answer(int x){
        ArrayList<Integer> al = new ArrayList<>();
        String cn = Integer.toBinaryString(x);
        // Take all the values of 1 that are joined together
        // Then need to find the sum of consecutive pairs and find the max sum
        int prevLength = 0;
        for(int i=0;i<cn.length();i++){
            if(cn.charAt(i) == '0'){
                al.add(prevLength);
                prevLength = 0;
            }else{
                prevLength = prevLength+1;
            }
        }
        if(cn.charAt(cn.length()-1) == '1')
            al.add(prevLength);
        int max = 0;
        for(int i=0;i<al.size()-1;i++){
            int p1 = al.get(i);
            int p2 = al.get(i+1);
            if(p1 + p2 > max){
                max = p1 + p2;
            }
        }
        return (max+1);
    }
    
    public static void main(String[] args)
    {
        int x = 1775;
        C_Flip_Bit c = new C_Flip_Bit();
        System.out.println(c.answer(x));
    }
    
}
