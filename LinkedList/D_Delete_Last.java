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
public class D_Delete_Last
{
    public static List delete(List head){
        List retrieve = head;
        while(head.next.next != null){
            head = head.next;
        }if(head.next == null)
            return null;
        head.next = null;
        head = retrieve;
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
        D_Insert_At_Beginning d = new D_Insert_At_Beginning();
        List head = null;
        for(int i=1;i<=5;i++)
            head = d.insert(head, i);
        head = delete(head);
        traverse(head);
    }
    
}
