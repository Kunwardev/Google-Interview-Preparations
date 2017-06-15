/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

/**
 *
 * @author Kunwar
 */
public class E_Reverse_With_Preserving_Space
{
    private String reverse(String word){
        int length = word.length();
        char[] arr = new char[length];
        for(int i=0;i<length;i++){
            if(word.charAt(i) == ' ')
                arr[i] = ' ';
        }
        
        int j = length-1;
        for(int i=0;i<length;i++){
            if(arr[i] != ' '){
                arr[i] = (word.charAt(j) == ' ')? word.charAt(--j) : word.charAt(j);
                j--;
            }
                
        }
        
        for(int i=0;i<length;i++)
            System.out.print(arr[i]);
        return arr.toString();
    }
    
    public static void main(String[] args)
    {
        E_Reverse_With_Preserving_Space e = new E_Reverse_With_Preserving_Space();
        System.out.println(e.reverse("Help Others"));
    }
    
}
