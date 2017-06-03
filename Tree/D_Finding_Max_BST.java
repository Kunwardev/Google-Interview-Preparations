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
public class D_Finding_Max_BST
{
    private static int Max_Number(BinaryTreeNode root){
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }
    
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(4);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(1);
        root.left.right = new BinaryTreeNode(3);
        root.right.left = new BinaryTreeNode(5);
        root.right.right = new BinaryTreeNode(7);
        System.out.println(Max_Number(root));
    }
    
}
