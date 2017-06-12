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
public class C_Delete_Middle_Node
{
    private List deleteMiddle(List head){
        List current = head;
        List slow = head, fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        int temp = slow.data;
        slow.data = slow.next.data;
        slow.next.data = temp;
        slow.next = slow.next.next;
        return current;
    }
    
    public void traverse(List head){
        List temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(3);
        head.next.next.next = new List(4);
        head.next.next.next.next = new List(5);
        C_Delete_Middle_Node c = new C_Delete_Middle_Node();
        head = c.deleteMiddle(head);
        c.traverse(head);
                
    }
    
}
