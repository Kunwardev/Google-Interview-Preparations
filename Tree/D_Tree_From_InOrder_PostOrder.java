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
public class D_Tree_From_InOrder_PostOrder
{
    private static BinaryTreeNode convert_into_Tree(int[] inOrder, int[] PostOrder){
        if(inOrder.length == 0 || PostOrder.length != inOrder.length)
            return null;
        return convert_into_Tree_help(inOrder, 0, inOrder.length-1, PostOrder, 0, PostOrder.length-1);
    }

    private static BinaryTreeNode convert_into_Tree_help(int[] inOrder, int inStart, int inEnd, int[] PostOrder, int postStart, int postEnd)
    {
        if(postStart > postEnd || inStart > inEnd)
            return null;
        int data = PostOrder[postEnd];
        int offset = inStart;
        BinaryTreeNode curr = new BinaryTreeNode(data);
        for(;offset<inEnd;offset++)
            if(inOrder[offset] == data)
                break;
        curr.left = convert_into_Tree_help(inOrder, inStart, offset-1, PostOrder, postStart, postStart+offset-inStart-1);
        curr.right = convert_into_Tree_help(inOrder, offset+1, inEnd, PostOrder, postStart+offset-inStart, postEnd-1);
        return  curr;
    }
    
    public static void main(String[] args)
    {
        int[] postOrder = new int[]{10,40,30,60,90,70,50};
        int[] inOrder = new int[] {10,30,40,50,60,70,90};
        BinaryTreeNode root = convert_into_Tree(inOrder, postOrder);
        D_Traversals t = new D_Traversals();
        t.preOrder(root);
    }
    
}
