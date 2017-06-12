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
class Index{
    public int value = 0;
}

public class C_Find_N_From_Last_Recursive
{
    private List function(List head, int k){
        Index i = new Index();
        return Nth_To_Last(head, k, i);
    }

    private List Nth_To_Last(List head, int k, Index i)
    {
        if(head == null)
            return null;
        List nd = Nth_To_Last(head.next, k, i);
        i.value = i.value + 1;
        if(i.value == k)
            return head;
        return nd;
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(3);
        head.next.next.next = new List(4);
        C_Find_N_From_Last_Recursive c = new C_Find_N_From_Last_Recursive();
        System.out.println(c.function(head, 2).data);
    }
    
}
