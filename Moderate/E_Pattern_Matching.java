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
public class E_Pattern_Matching
{
    private boolean matches(String pattern, String value){
        if(pattern.length() == 0)
            return value.length() == 0;
        char mainChar = pattern.charAt(0);
        char altChar = mainChar == 'a'? 'b':'a';
        int size = value.length();
        int countOfMain = countOf(pattern, mainChar);
        int countOfAlt = pattern.length() - countOfMain;
        int firstAlt = pattern.indexOf(altChar);
        int maxMainSize = size / countOfMain;
        
        for(int mainSize = 0;mainSize <= maxMainSize; mainSize++){
            int remainingLength = size - mainSize * countOfMain;
            String first = value.substring(0, mainSize);
            if(countOfAlt == 0 || remainingLength % countOfAlt == 0){
                int altIndex = firstAlt * mainSize;
                int altSize = countOfAlt == 0 ? 0: remainingLength/countOfAlt;
                String second = countOfAlt == 0 ? "" : value.substring(altIndex, altSize + altIndex);
                String cand = buildFromPattern(pattern, first, second);
                if(cand.equals(value))
                    return true;
            }
        }
        return false;
    }

    private int countOf(String pattern, char mainChar)
    {
        int count = 0;
        for(char a: pattern.toCharArray())
            if(a == mainChar)
                count++;
        return count;
    }

    private String buildFromPattern(String pattern, String main, String alt)
    {
        StringBuilder sb = new StringBuilder();
        char first = pattern.charAt(0);
        for(char c: pattern.toCharArray()){
            if(c == first)
                sb.append(main);
            else
                sb.append(alt);
        }
        System.out.println(sb);
        return sb.toString();
    }
    
    public static void main(String[] args)
    {
        String pattern = "aabb";
        String value = "catcatgocatgo";
        E_Pattern_Matching e = new E_Pattern_Matching();
        System.out.println(e.matches(pattern, value));
    }
    
}
