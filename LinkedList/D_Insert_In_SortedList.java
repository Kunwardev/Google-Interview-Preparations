/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

/**
 *
 * @author Kunwar
 */
public class D_Insert_In_SortedList
{
    private static List insert(List head, int data){
        List current = head, prev=null;
        if(head == null){
            return new List(data);
        }
        while(current != null && current.data < data){
            prev = current;
            current = current.next;
        }
        List temp = new List(data);
        temp.next = current;
        prev.next = temp;
        return head;
    }
    
    
    private static void traverse(List head){
        List temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(3);
        head.next.next = new List(4);
        head.next.next.next = new List(6);
        head = insert(head, 5);
        traverse(head);
    }
    
}
