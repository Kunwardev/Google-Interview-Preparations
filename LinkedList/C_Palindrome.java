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
public class C_Palindrome
{
    private List palindrome(List head){
        List current = middle(head);
        current.next = reverse(current.next);
        return head;
    }
    
    private List reverse(List head){
        List current = head;
        List prev = null, next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    private List middle(List head){
        List slow = head;
        List fast = head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null)
            slow = prev;
        //System.out.println(slow.data);
        return slow;
    }
    
    private boolean traverse(List head){
        List temp = head;
        List middle = middle(head);
        while(middle.next != null){
            if(temp.data != middle.next.data)
                return false;
            temp = temp.next;
            middle = middle.next;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(3);
        head.next.next.next = new List(2);
        head.next.next.next.next = new List(1);
       // head.next.next.next.next.next = new List(1);
        C_Palindrome c = new C_Palindrome();
        head = c.palindrome(head);
        System.out.println(c.traverse(head));
    }
    
}
