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
public class D_Insert_Binary_Tree
{
    private static BinaryTreeNode insert_Iterative_in_BT(BinaryTreeNode root, int data){
        if(root == null)
            root = new BinaryTreeNode(data);
        else{
            Queue<BinaryTreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                BinaryTreeNode tmp = q.poll();
                if(tmp != null){
                    if(tmp.getLeft() != null)
                        q.offer(tmp.left);
                    else{
                        tmp.left = new BinaryTreeNode(data);
                        return root;
                    }
                    if(tmp.getRight() != null)
                        q.offer(tmp.right);
                    else{
                        tmp.right = new BinaryTreeNode(data);
                        return root;
                    }
                }
            }
        }
        return root;
    }
    /* Not Working
    private static void insert_Recursive_in_BT_Helper(BinaryTreeNode root, int data){
        if(root.left == null){
            root.left = new BinaryTreeNode(data);
        }else
            insert_Recursive_in_BT_Helper(root.right, data);
        if(root.right == null){
            root.right = new BinaryTreeNode(data);
        }else
            insert_Recursive_in_BT_Helper(root.left, data);
    }
    
    private static void insert_Recursive_in_BT(BinaryTreeNode root, int data){
        if(root == null)
            root = new BinaryTreeNode(data);
        else{
            insert_Recursive_in_BT_Helper(root, data);
        }
    }
    */
    public static void main(String[] args)
    {
        BinaryTreeNode rut = null;
        rut = insert_Iterative_in_BT(rut, 5);
        rut = insert_Iterative_in_BT(rut, 8);
        rut = insert_Iterative_in_BT(rut, 2);
        D_Traversals t = new D_Traversals();
        t.inOrder(rut);
    }
    
}
