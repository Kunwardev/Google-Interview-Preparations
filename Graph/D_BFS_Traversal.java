/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class D_BFS_Traversal
{
    static Graph_1 g;
    private static void initialize(int x){
        g = new Graph_1(x);
    }
    
    private static void BFS(int p){
        int i=0;
        Queue<LinkedList> q = new LinkedList();
        boolean[] visited = new boolean[g.vertex];
        visited[p] = true;
        System.out.print(p+"->");
        q.offer(g.edge[p]);
        while(!q.isEmpty()){
            LinkedList s = q.poll();
            Iterator l = s.listIterator();
            while(l.hasNext()){
                Integer o = (Integer) l.next();
                if(visited[o] == false){
                    q.add(g.edge[o]);
                    System.out.print(o+"->");
                    visited[o] = true;
                }
            }
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args)
    {
        initialize(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 0);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        BFS(2);
    }
    
}
