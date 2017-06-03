/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class D_Zig_Zag_Traversal
{
    private static ArrayList<ArrayList<Integer>> zigzaglevelOrder(BinaryTreeNode root){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        if(root == null)
            return al;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            
            BinaryTreeNode tmp = q.poll();
            if(tmp != null){
                System.out.println(1);
                curr.add(tmp.data);
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }else{
                if(leftToRight){
                    ArrayList<Integer> c_curr = new ArrayList<>(curr);
                    al.add(c_curr);
                    curr.clear();
                }else{
                    Stack<Integer> st = new Stack<>();
                    st.addAll(curr);
                    ArrayList<Integer> c_curr = new ArrayList<>();
                    while(!st.isEmpty()){
                        c_curr.add(st.pop());
                    }
                    al.add(c_curr);
                    curr.clear();
                }
            }
            if(!q.isEmpty()){
                q.offer(null);
                leftToRight = !leftToRight;
            }
        }
        return al;
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
        System.out.println(zigzaglevelOrder(root));
    }
    
}
