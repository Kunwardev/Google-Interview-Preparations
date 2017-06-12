/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

/**
 *
 * @author Kunwar
 */
public class C_Count_Compression
{
    private static String function(String a){
        StringBuilder s = new StringBuilder();
        int counts = 0;
        for(int i=0;i<a.length();i++){
            counts++;
            if(i+1 >= a.length() || a.charAt(i) != a.charAt(i+1)){
                s.append(a.charAt(i)+""+counts);
                counts = 0;
            }
        }
        return s.toString();
    }
    
    public static void main(String[] args)
    {
        String a = "aaabcd";
        System.out.println(function(a));
    }
    
}
