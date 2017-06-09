/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

/**
 *
 * @author Kunwar
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class D_Prim
{
    static final int V = 5;
    private static int minKey(int key[], boolean[] mstSet){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0;i<V;i++){
            if(mstSet[i] == false && key[i] < min){
                min = key[i];
                index = i;
            }
            }
        return index;
    }
    
    private static void printMST(int[] parent, int n, int[][] graph){
        System.out.println("Edge\tWeight");
        for(int i=1;i<V;i++){
            System.out.println(parent[i]+" -> "+i+"  "+graph[i][parent[i]]);
        }
    }
    
    private static void prim(int[][] graph){
        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);
        
        key[0] = 0;
        parent[0] = -1;
        for(int count = 0;count<V-1;count++){
            
                int u = minKey(key, mstSet);
                mstSet[u] = true;
                for(int v=0;v<V;v++){
                    if(graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]){
                        parent[v] = u;
                        key[v] = graph[u][v];
                    }
            }
        }
        printMST(parent, V, graph);
    }
    
    public static void main(String[] args)
    {
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                                    {2, 0, 3, 8, 5},
                                    {0, 3, 0, 0, 7},
                                    {6, 8, 0, 0, 9},
                                    {0, 5, 7, 9, 0},
                                   };
        
        prim(graph);
    }
    
}

