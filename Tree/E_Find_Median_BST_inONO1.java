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
public class E_Find_Median_BST_inONO1
{
    private int countNode(BinaryTreeNode root){
        int k = 0;
        BinaryTreeNode current, prev;
        if(root == null)
            return k;
        current = root;
        while(current != null){
            if(current.left == null){
                k++;
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
                    k++;
                    current = current.right;
                }
            }
        }
    return k;
    }
    
    private double findMedian(BinaryTreeNode root){
        if(root == null)
            return 0;
        int count = countNode(root);
        int currCount = 0;
        BinaryTreeNode current = root, prev = null, pre;
        while(current != null){
            if(current.left == null){
                currCount++;
                if(count % 2 == 1 && currCount == (count+1)/2)
                    return (double)prev.data;
                else if(count % 2 == 0 && currCount == (count/2)+1)
                    return (double)(prev.data+current.data)/2;
                prev = current;
                current = current.right;
            }else{
                pre = current.left;
                while(pre.right != null && pre.right != current)
                    pre = pre.right;
                if(pre.right == null){
                    pre.right = current;
                    current = current.left;
                }else{
                    pre.right = null;
                    prev = pre;
                    currCount++;
                    if(count%2 == 1 && currCount == (count+1)/2)
                        return current.data;
                    else if(count %2 ==0 && currCount == (count/2)+1)
                        return (prev.data+current.data)/2;
                    prev = current;
                    current = current.right;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(50);
        root.left = new BinaryTreeNode(30);
        root.right = new BinaryTreeNode(70);
        root.left.left = new BinaryTreeNode(10);
        root.left.right = new BinaryTreeNode(40);
        root.right.left = new BinaryTreeNode(60);
        //root.right.right = new BinaryTreeNode(80);
        E_Find_Median_BST_inONO1 e = new E_Find_Median_BST_inONO1();
        System.out.println(e.findMedian(root));
    }
    
}
