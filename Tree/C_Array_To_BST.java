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
public class C_Array_To_BST
{
    private BinaryTreeNode makeTree(BinaryTreeNode root, int[] arr, int low, int high){
        if(low <= high){
            int mid = (low+high)/2;
            root = new BinaryTreeNode(arr[mid]);
            root.left = makeTree(root, arr, low, mid-1);
            root.right = makeTree(root, arr, mid+1, high);
            return root;
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        C_Array_To_BST c = new C_Array_To_BST();
        BinaryTreeNode root = null;
        root = c.makeTree(root, arr, 0, 6);
        //System.out.println(root.data+" "+root.left.data+" "+root.right.data);
    }
    
}
