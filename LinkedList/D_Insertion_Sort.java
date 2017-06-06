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
public class D_Insertion_Sort
{
    private static List insertionSort(List head){
        if(head == null || head.next == null)
            return head;
        List newHead = new List(head.data);
        List pointer = head.next;
        while(pointer != null){
            List innerPointer = newHead;
            List next = pointer.next;
            if(pointer.data <= newHead.data){
                List oldHead = newHead;
                newHead = pointer;
                pointer.next = oldHead;
            }else{
                while(innerPointer.next != null){
                    if(pointer.data > innerPointer.data && pointer.data <= innerPointer.next.data){
                        List oldHead = innerPointer.next;
                        innerPointer.next = pointer;
                        pointer.next = oldHead;
                    }innerPointer = innerPointer.next;
                }
                if(innerPointer.next == null && pointer.data > innerPointer.data){
                    innerPointer.next = pointer;
                    pointer.next = null;
                }
            }
            pointer = next;
        }
        return newHead;
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
        head.next = new List(4);
        head.next.next = new List(2);
        head.next.next.next = new List(3);
        traverse(head);
        head = insertionSort(head);
        traverse(head);
    }
    
}
