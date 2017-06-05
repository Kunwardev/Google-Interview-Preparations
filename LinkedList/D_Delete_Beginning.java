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
public class D_Delete_Beginning
{
    public static List delete(List head){
        if(head != null)
            return head.next;
        return null;
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
        List head = null;
        D_Insert_At_Beginning d = new D_Insert_At_Beginning();
        for(int i=1;i<=5;i++)
            head = d.insert(head, i);
        head = delete(head);
        traverse(head);
    }
    
}
