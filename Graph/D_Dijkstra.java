/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class D_Dijkstra
{
    private static int minDistance(int[] dist, boolean[] sptSet){
        int minDistance = Integer.MAX_VALUE, minIndex = -1;
        for(int i=0;i<dist.length;i++){
            if(sptSet[i] == false && dist[i] <= minDistance){
                minDistance = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    private static void Dijkstra(int[][] graph, int src){
        int[] distance = new int[graph.length];
        boolean[] sptSet = new boolean[graph.length];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(sptSet, false);
        distance[src] = 0;
        
        for(int i=0;i<graph.length-1;i++){
            int u = minDistance(distance, sptSet);
            sptSet[u] = true;
            for(int v = 0;v<graph.length;v++){
                if(!sptSet[v] && graph[u][v] != 0 && distance[u]+graph[u][v] < distance[v])
                    distance[v] = distance[u]+graph[u][v];
            }
        }
        printSolution(distance);
    }

    private static void printSolution(int[] distance)
    {
        System.out.println("Distance from Source to Vertex");
        for(int i=0;i<distance.length;i++){
            System.out.println(i+"\t\t"+distance[i]);
        }
    }
    
    public static void main(String[] args)
    {
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
        Dijkstra(graph, 0);
    }
    
}
