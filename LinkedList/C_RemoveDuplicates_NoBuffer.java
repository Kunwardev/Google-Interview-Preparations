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
public class C_RemoveDuplicates_NoBuffer
{
    private void deleteDups(List head){
        List current = head;
        while(current != null){
            List runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else
                    runner = runner.next;
            }
            current = current.next;
        }
    }
    
    private void traverse(List head){
        List ne = head;
        while(ne != null){
            System.out.print(ne.data+" ");
            ne = ne.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(3);
        head.next.next.next = new List(1);
        head.next.next.next.next = new List(4);
        C_RemoveDuplicates_NoBuffer c = new C_RemoveDuplicates_NoBuffer();
        c.deleteDups(head);
        c.traverse(head);
    }
    
}
