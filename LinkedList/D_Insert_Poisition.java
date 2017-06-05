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
public class D_Insert_Poisition
{
    private static int length(List head){
        int length = 0;
        while(head != null){
            head=head.next;
            length++;
        }
        return length;
    }
    
    private static List insert(List head, int data, int position){
        List retrieve = head;
        D_Insert_At_Beginning d = new D_Insert_At_Beginning();
        D_Insert_At_End e = new D_Insert_At_End();
        if(position <=0){
            head = d.insert(head, data);
            return head;
        }
        if(position >= length(head)){
            head = e.insert(head, data);
            return head;
        }
        while(position-- > 1){
            head = head.next;
        }
        List temp = new List(data);
        temp.next = head.next;
        head.next = temp;
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
        D_Insert_At_End e = new D_Insert_At_End();
        List head = null;
        for(int i=1;i<=5;i++){
            head = d.insert(head, i);
        }
        head = insert(head, 7, 6);
        traverse(head);
    }
    
}
