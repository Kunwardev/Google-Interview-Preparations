/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class D_Distance_UnweightedGraph
{
    static Graph_1 g;
    static int[] distance;
    
    private static void initialize(int x){
        g = new Graph_1(x);
        distance = new int[x];
        Arrays.fill(distance,-1);
    }
    
    private static void printArray(int s){
        int p = 0;
        for(int i: distance)
            System.out.println(p++ +"->"+ i);
    }
    
    private static void findDistance(int s){
        distance[s] = 0;
        Queue<Integer> q = new LinkedList();
        q.offer(s);
        while(!q.isEmpty()){
            int p = q.poll();
            Iterator<Integer> l = g.edge[p].listIterator();
            while(l.hasNext()){
                int a = l.next();
                if(distance[a] < 0){
                    q.offer(a);
                    distance[a] = distance[p]+1;
                }
            }
        }
        printArray(s);
    }
    
    public static void main(String[] args)
    {
        initialize(7);
        g.addEdge(0, 1);
        g.addEdge(0, 5);
        g.addEdge(1, 6);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 6);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(6, 4);
        g.addEdge(6, 5);
        findDistance(0);
    }
    
}
