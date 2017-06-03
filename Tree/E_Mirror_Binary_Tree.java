/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

/**
 *
 * @author Kunwar
 */
public class E_Mirror_Binary_Tree
{
    private static BinaryTreeNode mirror(BinaryTreeNode root){
        if(root == null)
            return null;
        BinaryTreeNode left = mirror(root.left);
        BinaryTreeNode right = mirror(root.right);
        root.left = right;
        root.right = left;
        
        return root;
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
        D_Traversals t = new D_Traversals();
        t.inOrder(root);
        System.out.println();
        root = mirror(root);
        t.inOrder(root);
    }
    
}
