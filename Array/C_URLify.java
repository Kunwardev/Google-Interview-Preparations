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
public class C_URLify
{
    private static String function(String a, int n){
        StringBuilder x = new StringBuilder();
        int length_a = a.length();
        if(n > length_a)
            return null;
        for(int i=0;i<n;i++){
            if(a.charAt(i) == ' ')
                x.append("%20");
            else
                x.append(a.charAt(i));
        }
        return x.toString();
    }
    
    public static void main(String[] args)
    {
        String a = "Mr John Smith        ";
        System.out.println(function(a, 13));
    }
    
}
