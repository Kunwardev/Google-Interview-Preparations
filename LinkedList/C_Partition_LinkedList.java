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
public class C_Partition_LinkedList
{
    private List partition(List head, int x){
        List node = new List(0), tail = new List(0), current = head;
        List a = node, b = tail;
        while(current != null){
            if(current.data <= x){
                node.next = new List(current.data);
                node = node.next;
            }else{
                tail.next = new List(current.data);
                tail = tail.next;
            }
            current = current.next;
        }
        node.next = b.next;
        return a.next;
    }
    
    public void traverse(List a){
        List x = a;
        while(x != null){
            System.out.print(x.data+" ");
            x = x.next;
        }
    } 
    
    public static void main(String[] args)
    {
        List a = new List(1);
        a.next = new List(4);
        a.next.next = new List(6);
        a.next.next.next = new List(9);
        a.next.next.next.next = new List(8);
        a.next.next.next.next.next = new List(3);
        C_Partition_LinkedList c = new C_Partition_LinkedList();
        List current = a;
        while(current != null){
            a = c.partition(a, current.data);
            current = current.next;
        }
        c.traverse(a);
    }
    
}
