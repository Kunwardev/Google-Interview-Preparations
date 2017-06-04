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
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(){}
}

class LinkedList
{
    private Node first;
    public LinkedList()
    {
        first = null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insert(int val)//inserts at beginning of list
    {
        Node newNode = new Node(val);
        newNode.next = first;
        first = newNode;
    }
    public void append(Node result)
    {
        first = result;
    }
    public void display()
    {
        System.out.println("List items from first to last :");
        Node current = first;
        while(current != null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("");
    }
    public Node extractFirst()
    {
        return first;
    }
    public Node MergeSort(Node headOriginal) 
    { 
        if (headOriginal == null || headOriginal.next == null) 
            return headOriginal; 
        Node a = headOriginal;
        Node b = headOriginal.next; 
            while ((b != null) && (b.next != null)) 
            { 
            headOriginal = headOriginal.next; 
            b = (b.next).next; 
        } 
            b = headOriginal.next; 
        headOriginal.next = null; 
        return merge(MergeSort(a), MergeSort(b));
          
    }    
 
    public Node merge(Node a, Node b) 
    { 
        Node temp = new Node(); 
        Node head = temp;
        Node c = head; 
            while ((a != null) && (b != null)) 
            {
            if (a.data <= b.data) 
                { 
                c.next = a; 
                c = a; 
                a = a.next; 
            } 
                else
                { 
                c.next = b; 
                c = b; 
                b = b.next;
            } 
            }
        c.next = (a == null) ? b : a; 
            return head.next; 
    } 
}


public class D_Merge_Sort_Using_LinkedLists
{
    static LinkedList checker = new LinkedList();
    
    public static void main(String[] args)
    {
        checker.insert(30);
        checker.insert(54);
        checker.insert(15);
        checker.insert(4);
        checker.insert(3);
        checker.insert(10);
        checker.insert(12);
        checker.insert(1);
        checker.append(checker.MergeSort(checker.extractFirst()));
        checker.display();
    }
    
    
    
}
