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
public class D_Least_Common_Ancestor
{
    private static BinaryTreeNode Least_Common(BinaryTreeNode root, BinaryTreeNode a, BinaryTreeNode b){
        BinaryTreeNode left, right;
        if(root == null)
            return root;
        if(root == a || root == b)
            return root;
        left = Least_Common(root.left, a, b);
        right = Least_Common(root.right, a, b);
        if(left != null && right != null)
            return root;
        if(left == null && right == null)
            return null;
        return left != null ? left : right;
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
        BinaryTreeNode toor = Least_Common(root, root.left, root.left.left);
        System.out.println(toor.data);
    }
    
}
