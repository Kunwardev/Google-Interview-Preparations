/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class D_Topological_Sorting
{
    static Graph_1 g;
    private static void initialize(int x){
        g = new Graph_1(x);
    }
    
    private static void topologicalSort(){
        Stack st = new Stack();
        boolean[] visited = new boolean[g.vertex];
        
        for(int i=0;i<g.vertex;i++){
            if(visited[i] == false){
                topolicalSortHelper(i, visited, st);
            }
        }
        
        while(!st.isEmpty()){
            System.out.print(st.pop()+"->");
        }
        
    }

    private static void topolicalSortHelper(int i, boolean[] visited, Stack st)
    {
        visited[i] = true;
        Integer v;
        Iterator<Integer> p = g.edge[i].listIterator();
        while(p.hasNext()){
            v = p.next();
            if(!visited[v]){
                visited[v] = true;
                topolicalSortHelper(v, visited, st);
            }
        }
        st.push(new Integer(i));
    }
    
    public static void main(String[] args)
    {
        initialize(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        topologicalSort();
        System.out.println("NULL");
    }
    
}
