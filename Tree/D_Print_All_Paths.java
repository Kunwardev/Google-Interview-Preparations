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
public class D_Print_All_Paths
{
    private static void print_All_Paths(BinaryTreeNode root){
        int[] paths = new int[256];
        printPaths(root, paths, 0);
    }

    private static void printPaths(BinaryTreeNode root, int[] paths, int i)
    {
        if(root == null)
            return;
        paths[i++] = root.getData();
        if( root.getLeft() == null && root.getRight() == null )
            printArray(paths, i);
        else{
            printPaths(root.left, paths, i);
            printPaths(root.right, paths, i);
        }
    }

    private static void printArray(int[] paths, int i)
    {
        for(int j=0;j<i;j++)
            System.out.print(paths[j]+" ");
        System.out.println();
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
        print_All_Paths(root);
    }
    
}
