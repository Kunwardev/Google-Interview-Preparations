/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class D_Vertical_Sum
{
    private static void vSum(HashMap<Integer, Integer> hm, BinaryTreeNode root, int c){
        if(root.left != null)
            vSum(hm, root.left, c-1);
        if(root.right != null)
            vSum(hm, root.right, c+1);
        int data = 0;
        if(hm.containsKey(c))
            data = hm.get(c);
        hm.put(c, data+root.data);
    }
    
    private static void verticalSum(BinaryTreeNode root){
        HashMap<Integer, Integer> hm = new HashMap<>();
        vSum(hm, root, 0);
        for(int k: hm.keySet())
            System.out.println(k+" --> "+hm.get(k));
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
        verticalSum(root);
    }
    
}
