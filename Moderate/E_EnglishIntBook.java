/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class E_EnglishIntBook
{
    String[] units = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight"
                    ,"Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
                    "Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy",
                    "Eighty","Ninety"};
    String hundred = "Hundred";
    String[] bigs = {"","Thousand","Million","Billion"};
    String negative = "negative";
    
    private String convert(int num){
        if(num == 0)
            return units[0];
        else if(num < 0){
            return negative + " " + convert(-1 * num);
        }
        
        LinkedList<String> parts = new LinkedList<>();
        int chunkCount = 0;
        while(num > 0){
            if(num % 1000 != 0){
                String chunk = convertChunk(num % 1000) + " "+ bigs[chunkCount];
                parts.addFirst(chunk);
                num /= 1000;
                chunkCount++; 
            }
        }
        return listToString(parts);
    }

    private String convertChunk(int num)
    {
        LinkedList<String> parts = new LinkedList<>();
        if(num >= 100){
            parts.addLast(units[num/100]);
            parts.addLast(hundred);
            num %= 100;
        }
        if(num >= 10 && num <= 19){
            parts.addLast(units[num]);
        }else if(num >= 20){
            parts.addLast(tens[num/10]);
            num %= 10;
        }
        if(num >= 1 && num <= 9){
            parts.addLast(units[num]);
        }
        return listToString(parts);
    }

    private String listToString(LinkedList<String> parts)
    {
        StringBuilder sb = new StringBuilder();
        while(parts.size() > 1){
            sb.append(parts.poll());
            sb.append(" ");
        }
        sb.append(parts.poll());
        return sb.toString();
    }
    
    
    public static void main(String[] args)
    {
        int x = 1123432;
        E_EnglishIntBook e = new E_EnglishIntBook();
        System.out.println(e.convert(x));
    }
    
}
