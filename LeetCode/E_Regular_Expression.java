/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
public class E_Regular_Expression
{
    private boolean isMatch(String s, String p){
        if(p.length() == 0){
            return s.length() == 0;
        }
        
        if(p.length() == 1 || p.charAt(1) != '+'){
            if(s.length() < 1 || p.charAt(0) != '.' && s.charAt(0) != p.charAt(0))
                return false;
            return isMatch(s.substring(1), p.substring(1));
        }else{
            int length = s.length();
            int i = -1;
            while(i < length &&(i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))){
                if(isMatch(s.substring(i+1), p.substring(2)))
                    return true;
                i++;
                }
            return false;
        }
        
    }
    
    public static void main(String[] args)
    {
        E_Regular_Expression e = new E_Regular_Expression();
        System.out.println(e.isMatch("aa", ".+"));
    }
   
}
