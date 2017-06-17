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
public class E_Morris_InOrder_Traversal_UsesNoSpace
{
    private void InOrder(BinaryTreeNode root){
        int k = 0;
        BinaryTreeNode current, prev;
        if(root == null)
            return ;
        current = root;
        while(current != null){
            if(current.left == null){
                System.out.print(current.data+" ");
                current = current.right;
            }else{
                prev = current.left;
                while(prev.right != null && prev.right != current){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = current;
                    current = current.left;
                }else{
                    prev.right = null;
                    System.out.print(current.data+" ");
                    current = current.right;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(2);
        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(3);
        E_Morris_InOrder_Traversal_UsesNoSpace e = new E_Morris_InOrder_Traversal_UsesNoSpace();
        e.InOrder(root);
    }
    
}
