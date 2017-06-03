/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class D_Finding_Number_of_Full_Nodes
{
    // Finding Number of leaves
    private static int numbers(BinaryTreeNode root){
        int count = 0;
        if(root == null)
            return count;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.getLeft() == null && tmp.getRight() == null)
                count++;
            if(tmp.getLeft() != null)
                q.offer(tmp.left);
            if(tmp.getRight() != null)
                q.offer(tmp.right);
        }
        return count;
    }
    // For Iteration, take Queue and the node that is having both left and right
    // null, increase count
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        System.out.println(numbers(root));
    }
    
}
