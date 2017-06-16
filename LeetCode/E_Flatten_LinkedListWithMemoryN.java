/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class E_Flatten_LinkedListWithMemoryN
{
    private void flatten(Tree root){
        Stack<Tree> stack = new Stack<>();
        Tree p = root;
        while(p != null || !stack.isEmpty()){
            if(p.right != null){
                stack.push(p.right);
            }
            if(p.left != null){
                p.right = p.left;
                p.left = null;
            }else if(!stack.isEmpty()){
                Tree temp = stack.pop();
                p.right = temp;
            }
            p = p.right;
        }
    }
    
    private void Traverse(Tree head){
        Tree temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(5);
        root.left.left = new Tree(3);
        root.left.right = new Tree(4);
        root.right.right = new Tree(6);
        E_Flatten_LinkedListWithMemoryN e = new E_Flatten_LinkedListWithMemoryN();
        e.flatten(root);
        e.Traverse(root);
    }
    
}
