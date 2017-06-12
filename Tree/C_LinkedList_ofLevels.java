/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class C_LinkedList_ofLevels
{
    ArrayList<LinkedList<Integer>> al = new ArrayList<>();
    private void makeList(BinaryTreeNode root){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        LinkedList<Integer> l = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
            BinaryTreeNode temp = q.poll();
            if(temp != null){
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
                l.add(temp.data);
            }
            else{
                if(!q.isEmpty())
                    q.offer(null);
                al.add(l);
                l = new LinkedList<>();
            }
        }
    }
    
    public static void main(String[] args)
    {
        C_LinkedList_ofLevels c = new C_LinkedList_ofLevels();
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        c.makeList(root);
        System.out.println(c.al);
    }
    
}
