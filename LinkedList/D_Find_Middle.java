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
public class D_Find_Middle
{
    private static List find(List a){
        List slow = a;
        List fast = a;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static void main(String[] args)
    {
        List a = new List(1);
        System.out.println(find(a).data);
    }
    
}
