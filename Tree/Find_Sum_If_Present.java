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
public class Find_Sum_If_Present
{
    private static boolean check(BinaryTreeNode root, int sum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null && root.data == sum)
            return true;
        return (check(root.left, sum-root.data) || check(root.right, sum-root.data));
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
        System.out.println(check(root, 1));
    }
    
}
