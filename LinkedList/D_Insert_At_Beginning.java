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
public class D_Insert_At_Beginning
{
    
    public static List insert(List head, int data){
        if(head == null){
            head = new List(data);
        }else{
            List temp = new List(data);
            temp.next = head;
            head = temp;
        }
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
        List head = null;
        for(int i=1;i<=5;i++){
            head = insert(head, i);
        }
        traverse(head);
    }
    
}
