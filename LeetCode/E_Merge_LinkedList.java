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
public class E_Merge_LinkedList
{
    private List merge(List head1, List head2){
        List dummy_head = new List(0);
        List p = dummy_head;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                p.next = head1;
                head1 = head1.next;
            }else{
                p.next = head2;
                head2 = head2.next;
            }
            p = p.next;
        }
        
        if(head1 == null)
            p.next = head2;
        if(head2 == null)
            p.next = head1;
        return dummy_head.next;
    }
    
    private void traverse(List head){
        List temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        E_Merge_LinkedList e = new E_Merge_LinkedList();
        List head1 = new List(1);
        head1.next = new List(3);
        head1.next.next = new List(5);
        List head2 = new List(2);
        head2.next = new List(4);
        
        List head = e.merge(head1, head2);
        e.traverse(head);
    }
    
}
