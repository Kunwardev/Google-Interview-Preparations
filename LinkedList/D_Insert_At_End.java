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
public class D_Insert_At_End
{
    private static void traverse(List head){
        List temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static List insert(List head, int data){
        List retrieve;
        if(head == null){
            head = new List(data);
        }else{
            retrieve = head;
            List temp = new List(data);
            while(head.next != null){
                head = head.next;
            }head.next = temp;
            head = retrieve;
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        List head = null;
        for(int i=1;i<=5;i++)
            head = insert(head, i);
        traverse(head);
    }
    
}
