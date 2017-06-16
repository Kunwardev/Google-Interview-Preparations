/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
public class E_Path_Sum
{
    private boolean function(Tree root, int sum){
        boolean result;
        if(root == null && sum == 0)
            return true;
        if(root == null)
            return false;
        result = function(root.left, sum-root.data) || function(root.right,sum-root.data);
        return result;
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(5);
        root.left.left = new Tree(3);
        root.left.right = new Tree(4);
        root.right.right = new Tree(6);
        E_Path_Sum e = new E_Path_Sum();
        System.out.println(e.function(root, 7));
    }
    
}
