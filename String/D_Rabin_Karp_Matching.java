/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class D_Rabin_Karp_Matching
{
    private static ArrayList<Integer> calculateHash(String a, int k, int prime){
        int m = a.length();
        ArrayList<Integer> al = new ArrayList<>();
        int Hash = 0,prev=0;
        for(int i=0;i<k;i++){
            Hash += (a.charAt(i)-'a'+1)*Math.pow(prime, i);
        }al.add(Hash);
        for(int i=k;i<m;i++){
            int x = Hash - (a.charAt(prev++)-'a'+1);
            x = x/prime;
            Hash = (int) (x + Math.pow(prime, k-1) * (a.charAt(i)-'a'+1));
            al.add(Hash);
        }
        return al;
    }
    
    private static int rkfunction(String ptn, String text){
        ArrayList<Integer> pattern = calculateHash(ptn, ptn.length(), 3);
        ArrayList<Integer> texts = calculateHash(text, ptn.length(), 3);
        int p = pattern.get(0);
        int j=0;
        for(int i=0;i<texts.size();i++){
            if(p == texts.get(i)){
                for(j=0;j<ptn.length();j++){
                    if(ptn.charAt(j) == text.charAt(i+j)){}
                }
                if(j == ptn.length())
                    return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        String ptn = "abc";
        String text = "abedabc";
        System.out.println(rkfunction(ptn, text));
    }
    
}
