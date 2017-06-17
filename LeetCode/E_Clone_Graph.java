/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
// Using a queue for Breadth First Traversal
// A map is used to store the visited nodes

class UndirectedGraphNode{
    int label;
    ArrayList<UndirectedGraphNode> neighbors;
    
    public UndirectedGraphNode(int x){
        this.label = x;
        neighbors = new ArrayList<>();
    }
    
}

public class E_Clone_Graph
{
    private UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        if(node == null)
            return null;
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<>();
        UndirectedGraphNode newHead = new UndirectedGraphNode(node.label);
        queue.add(node);
        hm.put(node, newHead);
        
        while(!queue.isEmpty()){
            UndirectedGraphNode curr = queue.poll();
            ArrayList<UndirectedGraphNode> currNeighbors = curr.neighbors;
            
            for(UndirectedGraphNode aNeighbors : currNeighbors){
                if(!hm.containsKey(aNeighbors)){
                    UndirectedGraphNode copy = new UndirectedGraphNode(aNeighbors.label);
                    hm.put(aNeighbors, copy);
                    hm.get(curr).neighbors.add(copy);
                    queue.add(aNeighbors);
                }else{
                    hm.get(curr).neighbors.add(hm.get(aNeighbors));
                }
            }
        }
        return newHead;
    }
    
    
    
}
