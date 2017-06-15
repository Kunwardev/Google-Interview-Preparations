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
public class E_strStr
{
    private String strStr(String haystack, String needle){
        int needleLen = needle.length();
        int hayStackLen = haystack.length();
        if(needleLen == hayStackLen && needleLen == 0)
            return "";
        if(needleLen == 0)
            return haystack;
        
        for(int i=0;i<hayStackLen;i++){
            if(hayStackLen - i + 1 < needleLen){
                return null;
            }
            int k = i, j = 0;
            
            while(j < needleLen && k < hayStackLen && needle.charAt(j) == haystack.charAt(k)){
                j++;k++;
                if(j == needleLen)
                    return haystack.substring(i);
            }
            
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        E_strStr e = new E_strStr();
        String haystack = "qwertyuiop";
        String needle = "tyui";
        System.out.println(e.strStr(haystack, needle));
    }
    
}
