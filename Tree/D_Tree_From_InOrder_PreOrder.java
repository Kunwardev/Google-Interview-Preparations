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
public class D_Tree_From_InOrder_PreOrder
{
    private static BinaryTreeNode convert_into_tree(int[] preOrder, int[] inOrder){
        if(preOrder.length == 0 || preOrder.length != inOrder.length)
            return null;
        return convert_into_tree_helper(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
    }

    private static BinaryTreeNode convert_into_tree_helper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd)
    {
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        int data = preOrder[preStart];
        BinaryTreeNode curr = new BinaryTreeNode(data);
        int offset = inStart;
        for(;offset < inEnd;offset++){
            if(inOrder[offset] == data)
                break;
        }
        curr.left = convert_into_tree_helper(preOrder, preStart+1, preStart+offset-inStart, inOrder, inStart, offset-1);
        curr.right = convert_into_tree_helper(preOrder, preStart+offset-inStart+1, preEnd, inOrder, offset+1, inEnd);
        return curr;
    }
    
    public static void main(String[] args)
    {
        int[] preOrder = new int[]{50,30,10,40,70,60,90};
        int[] inOrder = new int[]{10,30,40,50,60,70,90};
        BinaryTreeNode root = convert_into_tree(preOrder, inOrder);
        D_Traversals t = new D_Traversals();
        t.postOrder(root);
    }
    
}
