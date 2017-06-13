/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class C_Permutations_With_Dups
{
    private ArrayList<String> getPerm(String str){
        ArrayList<String> result = new ArrayList<>();
        HashMap<Character, Integer> map = buildFreqTable(str);
        getPerms(map, "",str.length(), result);
        return result;
    }    

    private HashMap<Character, Integer> buildFreqTable(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 0);
            }
            map.put(c, map.get(c)+1);
        }
        return map;
    }

    private void getPerms(HashMap<Character, Integer> map, String string, int length, ArrayList<String> result)
    {
        if(length == 0){
            result.add(string);
            return;
        }
        for(Character c: map.keySet()){
            int count = map.get(c);
            if(count > 0){
                map.put(c, count - 1);
                getPerms(map, string+c, length-1, result);
                map.put(c, count);
            }
        }
    }
    
    public static void main(String[] args)
    {
        String str = "hello";
        C_Permutations_With_Dups c = new C_Permutations_With_Dups();
        System.out.println(c.getPerm(str));
    }
    
}
