/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;
import LinkedList.List;
import LinkedList.D_Insert_At_Beginning;
/**
 *
 * @author Kunwar
 */
public class D_Find_N_node_From_LinkedList
{
    static int counter = 0;
    private static List find(List head, int n){
        List result = head;
        if(head != null){
            result = find(head.next, n);
            if(counter++ == n)
                result = head;
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        List head = null;
        D_Insert_At_Beginning d = new D_Insert_At_Beginning();
        for(int i=10;i>=1;i--){
            head = d.insert(head, i);
        }
        System.out.println(find(head, 3).data);
    }
    
}
