/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class Graph_1
{
    static int vertex;
    static LinkedList edge[];
    
    
    public Graph_1(int x){
        this.vertex = x;
        edge = new LinkedList[x];
        for(int i=0;i<x;i++){
            edge[i] = new LinkedList();
        }
    }
    
    public static void addEdge(int to, int from){
        edge[to].add(from);
    }
    
    public static void traverse(Graph_1 g){
        for(int i=0;i<g.vertex;i++){
            System.out.print(i+"->");
            if(g.edge[i].size() > 0){
                Iterator p = g.edge[i].listIterator();
                while(p.hasNext()){
                    System.out.print(p.next()+"->");
                }
            }
            System.out.println("NULL");
        }
    }
    
    
    public static void main(String[] args)
    {
        Graph_1 g = new Graph_1(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        
        traverse(g);
    }
    
}
