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
public class D_BST_to_DLL
{
    static BinaryTreeNode prev = null, head = null;
    private static void BST2DLL(BinaryTreeNode root){
        if(root == null)
            return;
        BST2DLL(root.left);
        if(prev == null)
            head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BST2DLL(root.right);
    }
    
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        BST2DLL(root);
    }
    
}
