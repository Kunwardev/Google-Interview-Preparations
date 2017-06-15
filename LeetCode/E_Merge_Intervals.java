/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kunwar
 */

class Interval{
    int start, end;
    
    Interval(){
        this.start = 0;
        this.end = 0;
    }
    
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
    
}

class IntervalComparator implements Comparator<Interval>{

    public int compare(Interval o1, Interval o2)
    {
        return o1.start - o2.start;
    }
    
}

public class E_Merge_Intervals
{
    private ArrayList<Interval> merge(ArrayList<Interval> list){
        if(list == null || list.size()<=1)
            return list;
        Collections.sort(list, new IntervalComparator());
        ArrayList<Interval> result = new ArrayList<>();
        Interval prev = list.get(0);
        for(int i=1;i<list.size();i++){
            Interval current = list.get(i);
            if(prev.end >= current.start){
                Interval merged = new Interval(prev.start, Math.max(prev.end, current.end));
                prev = merged;
            }else{
                result.add(prev);
                prev = current;
            }
        }
        result.add(prev);
        return result;
    }
    
    public static void main(String[] args)
    {
        E_Merge_Intervals e = new E_Merge_Intervals();
        ArrayList<Interval> al = new ArrayList<>();
        Interval p = new Interval(1, 3);
        Interval q = new Interval(2, 6);
        Interval r = new Interval(8, 10);
        al.add(p);al.add(q);al.add(r);
        al = (e.merge(al));
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i).start+" "+al.get(i).end);
        }
    }
    
}
