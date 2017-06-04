/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

/**
 *
 * @author Kunwar
 */
public class D_Tree_Sort
{
    private static void inOrder(D_BST root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args)
    {
        D_BST d = new D_BST();
        d = d.insert(d, 4);
        d = d.insert(d, 2);
        d = d.insert(d, 1);
        d = d.insert(d, 3);
        d = d.insert(d, 6);
        d = d.insert(d, 7);
        d = d.insert(d, 5);
        inOrder(d);
    }
}
