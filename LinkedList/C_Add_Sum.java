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
public class C_Add_Sum
{
    private List sum(List a, List b){
        int carry = 0;
        return sumHelper(a, b, carry);
    }

    private List sumHelper(List a, List b, int carry)
    {
        if(a == null && b == null && carry == 0)
            return null;
        List result = new List(0);
        int value = carry;
        if(a != null){
            value += a.data;
        }
        if(b != null){
            value += b.data;
        }
        result.data = value % 10;
        if(a != null || b != null){
            List more = sumHelper(a == null ? null : a.next, b == null ? null : b.next, value >= 10 ? 1 : 0);
            result.next = more;
        }
        return result;
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
        List a = null;
        a = d.insert(a, 6);
        a = d.insert(a, 1);
        a = d.insert(a, 7);
        List b = null;
        b = d.insert(b, 2);
        b = d.insert(b, 9);
        b = d.insert(b, 5);
        C_Add_Sum c = new C_Add_Sum();
        List result = c.sum(a, b);
        c.traverse(a);
        System.out.println();
        c.traverse(b);
        System.out.println();
        c.traverse(result);
    }
    
}
