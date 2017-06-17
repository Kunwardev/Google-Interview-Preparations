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
public class E_FindKthSmallestUsingNoSpace
{
    private int FindKth(BinaryTreeNode root, int k){
        int l = 1;
        BinaryTreeNode current, prev;
        if(root == null)
            return -1;
        current = root;
        while(current != null){
            if(current.left == null){
                //System.out.print(current.data+" ");
                l++;
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
                    //System.out.print(current.data+" ");
                    l++;
                    current = current.right;
                }
            }
            if(l == k){
                if(current != null)
                    return current.data;
                else
                    return -1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(2);
        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(3);
        E_FindKthSmallestUsingNoSpace e = new E_FindKthSmallestUsingNoSpace();
        System.out.println(e.FindKth(root, 5));
    
    }
    
}
