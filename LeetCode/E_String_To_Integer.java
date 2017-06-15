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
public class E_String_To_Integer
{
    private int atoi(String str){
        if(str == null || str.length() < 1)
            return 0;
        str = str.trim();
        char flag = '+';
        int i = 0;
        if(str.charAt(i) == '-'){
            flag = '-';
            i++;
        }else if(str.charAt(i) == '+')
            i++;
        
        double result = 0;
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            result = result * 10 + (str.charAt(i)-'0');
            i++;
        }
        if(i != str.length())
            throw new IllegalArgumentException("There are some other characters except digits");
        if(flag == '-')
            result = -result;
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)result;
    }
    
    public static void main(String[] args)
    {
        String x = "1s234";
        E_String_To_Integer e = new E_String_To_Integer();
        System.out.println(e.atoi(x));
    }
    
}
