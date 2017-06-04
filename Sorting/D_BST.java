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
public class D_BST
{
    int data;
    D_BST left, right;
    
    
    public D_BST insert(D_BST root, int data){
        if(root == null){
            root = new D_BST();
            root.data = data;
        }
        else{
            if(root.data <= data){
                root.right = insert(root.right, data);
            }else{
                root.left = insert(root.left, data);
            }
        }
        return root;
    }
    
}
