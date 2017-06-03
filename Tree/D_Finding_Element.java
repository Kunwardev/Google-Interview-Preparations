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
public class D_Finding_Element
{
    private static boolean find_Iterative(BinaryTreeNode root, int data){
        if(root == null)
            return false;
        else{
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            while(! q.isEmpty()){
                BinaryTreeNode tmp = q.poll();
                if(tmp.data == data)
                    return true;
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }
        }
        return false;
    }
    
    private static boolean find_Recursive(BinaryTreeNode root, int data){
        if(root != null){
            if(root.getData() == data)
                return true;
            return find_Recursive(root.left, data) || find_Recursive(root.right, data);
        }
        else
            return false;
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
        System.out.println(find_Iterative(root, 3));
        System.out.println(find_Iterative(root, 8));
        System.out.println(find_Recursive(root, 4));
        System.out.println(find_Recursive(root, 10));
    }
    
}
