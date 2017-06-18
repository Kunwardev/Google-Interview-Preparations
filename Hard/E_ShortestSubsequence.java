/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hard;

/**
 *
 * @author Kunwar
 */
class Range{
    private int start,end;
    
    public Range(int start, int end){
        this.start = start;
        this.end = end;
    }
    
    public int length(){
        return end - start + 1;
    }
    
    public int getStart(){
        return start;
    }
    
    public int getEnd(){
        return end;
    }
    
    public boolean shorterThan(Range other){
        return length() < other.length();
    }
    
    public String toString(){
        return ("("+this.start+", "+this.end+")");
    }
    
}

public class E_ShortestSubsequence
{
    private Range shortestSubsequence(int[] big, int[] small){
        int[] closures = getClosures(big, small);
        return getShortestClosures(closures);
    }

    private int[] getClosures(int[] big, int[] small)
    {
        int[] closure = new int[big.length];
        for(int i=0;i<small.length;i++){
            sweepForClosure(big, closure, small[i]);
        }
        return closure;
    }

    private Range getShortestClosures(int[] closures)
    {
        Range shortest = new Range(0, closures[0]);
        for(int i=1;i<closures.length;i++){
            if(closures[i] == -1){
                break;
            }
            Range range = new Range(i, closures[i]);
            if(!shortest.shorterThan(range))
                shortest = range;
        }
        return shortest;
    }

    private void sweepForClosure(int[] big, int[] closures, int i)
    {
        int next = -1;
        for(int k=big.length-1;k>=0;k--){
            if(big[k] == i)
                next = k;
            if(next == -1 || closures[k] < next && closures[k] != -1)
                closures[k] = next;
        }
    }
    
    public static void main(String[] args)
    {
        int[] big = new int[]{7,5,9,0,2,1,3,5,7,9,1,1,8,5,8,9,7};
        int[] small = new int[]{1,5,9};
        E_ShortestSubsequence e = new E_ShortestSubsequence();
        System.out.println(e.shortestSubsequence(big, small));
    }
    
}
