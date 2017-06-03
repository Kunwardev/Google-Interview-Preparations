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
public class D_Finding_Max_BT
{
    // Time Complexity: O(N) Space Complexity: O(n)
    private static int max_Element_Recursive(BinaryTreeNode root){
        int maxValue = Integer.MIN_VALUE;
        if(root != null){
            int leftMax = max_Element_Recursive(root.left);
            int rightMax = max_Element_Recursive(root.right);
            maxValue = (leftMax > rightMax) ? leftMax : rightMax;
            if(maxValue < root.data)
                maxValue = root.data;
        }
        return maxValue;
    }
    
    private static int max_Element_Iterative(BinaryTreeNode root){
        int maxValue = Integer.MIN_VALUE;
        if(root == null)
            return maxValue;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp.getData() > maxValue)
                maxValue = tmp.getData();
            if(tmp.left != null)
                q.offer(tmp.left);
            if(tmp.right != null)
                q.offer(tmp.right);
        }
        return maxValue;
    }
    
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        System.out.println(max_Element_Recursive(root));
        System.out.println(max_Element_Iterative(root));
    }
    
}
