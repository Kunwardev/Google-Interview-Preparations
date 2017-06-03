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
public class D_Height
{
    private static int Height_Recursive(BinaryTreeNode root){
        if(root == null)
            return 0;
        int left = Height_Recursive(root.left);
        int right = Height_Recursive(root.right);
        return(left > right)?left+1 : right+1;
    }
    
    private static int Height_Iterative(BinaryTreeNode root){
        if(root == null)
            return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int count = 1;
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp != null){
                if(tmp.left == null && tmp.right == null)
                    return count;
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }else{
                if(!q.isEmpty()){
                    count++;
                    q.offer(null);
                }
            }
        }
        return count;
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
        System.out.println(Height_Iterative(root));
        System.out.println(Height_Recursive(root));
    }
    
}
