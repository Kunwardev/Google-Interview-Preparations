/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import com.sun.javafx.fxml.expression.BinaryExpression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Kunwar
 */
public class D_DuplicateSubtrees
{
    static int MARKER = -1;

    static ArrayList<String> al = new ArrayList<String>();
    private static String dupSubUtil(BinaryTreeNode root){
        String s = "";
        if(root == null)
            return (s + MARKER);
        
        String lStr = dupSubUtil(root.left);
        if(lStr.compareTo(s) == 0)
            return s;
        
        String rStr = dupSubUtil(root.right);
        if(rStr.compareTo(s) == 0)
            return s;
        
        s = s + root.data + lStr + rStr;
        ListIterator<String> l = al.listIterator(al.size());
        if(l.hasPrevious())
            if(s.length() > 3 && al.contains(s) && s != (l.previous()))
                return "";
        al.add(s);
        return s;
    } 
    
    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.right = new BinaryTreeNode(6);
        root.right.right.right = new BinaryTreeNode(7);
        root.right.right.left = new BinaryTreeNode(8);
        
        String st = dupSubUtil(root);
        if(st.compareTo("") == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
