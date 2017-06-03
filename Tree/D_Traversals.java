/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import com.sun.javafx.fxml.expression.BinaryExpression;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class D_Traversals
{
    // For getting the levelOrderTraversal in reverse Order, just add stack
    public static ArrayList<ArrayList<BinaryTreeNode>> levelOrder(BinaryTreeNode root){
        ArrayList<ArrayList<BinaryTreeNode>> al = new ArrayList<>();
        if(root == null)
            return al;
        ArrayList<BinaryTreeNode> b = new ArrayList<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp!= null){
                b.add(tmp);
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }else{
                al.add(b);
                b = new ArrayList<>();
                if(!q.isEmpty())
                    q.offer(null);
            }
            
        }
        return al;
    }
    
    public static void inOrder(BinaryTreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    
    public static void preOrder(BinaryTreeNode root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public static void postOrder(BinaryTreeNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
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
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        ArrayList<ArrayList<BinaryTreeNode>> a = levelOrder(root);
        ArrayList<BinaryTreeNode> b = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            b = a.get(i);
            for(int j=0;j<b.size();j++){
                System.out.print(b.get(j).data+" ");
            }System.out.println();
        }
    }
}
