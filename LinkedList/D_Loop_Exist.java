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
public class D_Loop_Exist
{
    private static List findStart(List head){
        List slow = head, fast = head;
        boolean loopExist = false;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                loopExist = true;
                break;
            }
        }
        if(loopExist){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        else
            return null;
    }
    
    private static boolean loop(List head){
        List slow = head, fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(3);
        head.next.next = new List(2);
        head.next.next.next = new List(5);
        head.next.next.next.next = head.next;
        System.out.println(loop(head));
        System.out.println(findStart(head).data);
    }
    
}
