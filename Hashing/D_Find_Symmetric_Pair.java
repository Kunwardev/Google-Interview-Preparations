/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
/**
 *
 * @author Kunwar
 */
public class D_Find_Symmetric_Pair
{
    private static HashMap<Integer, Integer> make_Pair(ArrayList<ArrayList<Integer>> l){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<l.size();i++){
            ArrayList<Integer> a = l.get(i);
            hm.put(a.get(0), a.get(1));
        }
        return hm;
    }
    
    private static void print_Symmetric_Pair(ArrayList<ArrayList<Integer>> l){
        HashMap<Integer, Integer> hm = make_Pair(l);
        for(Entry<Integer,Integer> e: hm.entrySet()){
            if(hm.containsValue(e.getKey())){
                System.out.print("{"+e.getKey()+" "+e.getValue()+"} ");
                System.out.println("{"+e.getValue()+" "+e.getKey()+"}");
                hm.put(e.getKey(), -1);
            }
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        a.add(1);a.add(3);
        al.add(a);
        a = new ArrayList<>();
        a.add(2);a.add(6);
        al.add(a);
        a = new ArrayList<>();
        a.add(3);a.add(5);
        al.add(a);
        a = new ArrayList<>();
        a.add(7);a.add(4);
        al.add(a);
        a = new ArrayList<>();
        a.add(5);a.add(3);
        al.add(a);
        a = new ArrayList<>();
        a.add(8);a.add(7);
        al.add(a);
        a = new ArrayList<>();
        a.add(7);a.add(4);
        al.add(a);
        print_Symmetric_Pair(al);
    }
    
    
}
