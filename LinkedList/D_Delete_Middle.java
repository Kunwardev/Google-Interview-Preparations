/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

import com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM;

/**
 *
 * @author Kunwar
 */
public class D_Delete_Middle
{
    private static int length(List head){
        int length = 0;
        while(head != null){
            head=head.next;
            length++;
        }
        return length;
    }
    
    private static List delete(List head, int pos){
        D_Delete_Beginning d = new D_Delete_Beginning();
        D_Delete_Last e = new D_Delete_Last();
        List retrieve = head;
        if(pos <=0)
            head = d.delete(head);
        else if(pos >= length(head))
            head = e.delete(head);
        else{
            while(pos-- > 1){
                head = head.next;
            }head.next = head.next.next;
        }
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
        for(int i=5;i>=1;i--){
            head = d.insert(head, i);
        }
        head = delete(head, 3);
        traverse(head);
    }
    
}
