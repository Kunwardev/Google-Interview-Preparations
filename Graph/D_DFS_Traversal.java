/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import static Graph.D_BFS_Traversal.g;
import java.util.Iterator;

/**
 *
 * @author Kunwar
 */
public class D_DFS_Traversal
{
    static Graph_1 g;
    private static void initialize(int x){
        g = new Graph_1(x);
    }
    
    private static void DFS(int x){
        boolean[] visited = new boolean[g.vertex];
        DFS_Helper(x, visited);
        System.out.println("NULL");
    }

    private static void DFS_Helper(int x, boolean[] visited)
    {
        if(visited[x] == false){
            visited[x] = true;
            System.out.print(x+"->");
            Iterator i = g.edge[x].listIterator();
            while(i.hasNext()){
                int p = (Integer)i.next();
                if(visited[p] == false){
                    DFS_Helper(p, visited);
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        initialize(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 0);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        DFS(2);
    }
    
}
