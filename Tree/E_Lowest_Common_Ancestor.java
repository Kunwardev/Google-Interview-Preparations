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
public class E_Lowest_Common_Ancestor
{
    private BinaryTreeNode findLCA(BinaryTreeNode root, int a, int b){
        if(root == null)
            return null;
        if(root.data == a || root.data == b){
            return root;
        }
        BinaryTreeNode left = findLCA(root.left, a, b);
        BinaryTreeNode right = findLCA(root.right, a, b);
        if(left != null && right != null)
            return root;
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
        E_Lowest_Common_Ancestor e = new E_Lowest_Common_Ancestor();
        System.out.println(e.findLCA(root, 5, 7).data);
    }
    
}
