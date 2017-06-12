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
public class C_Route_Between_Nodes
{
    private boolean findRoute(Graph_1 g, int src, int dest){
        boolean[] visited = new boolean[g.vertex];
        Queue<LinkedList> q = new LinkedList<>();
        q.offer(g.edge[src]);
        visited[src] = true;
        while(!q.isEmpty()){
            LinkedList p = q.poll();
            Iterator i = p.listIterator();
            while(i.hasNext()){
                Integer o = (Integer) i.next();
                q.offer(g.edge[o]);
                visited[o] = true;
                if(o == dest)
                    return true;
            }
        }
        
        for(boolean a: visited){
            System.out.print(a+" ");
        }
        
        return false;
    }
    
    public static void main(String[] args)
    {
        Graph_1 g = new Graph_1(4);
        g.addEdge(1, 2);
        g.addEdge(0, 1);
        C_Route_Between_Nodes c = new C_Route_Between_Nodes();
        
        System.out.println(c.findRoute(g, 0, 2));
    }
    
}
