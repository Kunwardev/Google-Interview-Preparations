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
public class D_Find_N_node_From_LinkedList
{
    private static int find(List head, int n){
        List h1 = head, h2 = head;
        for(int i=0;i<n;i++){
            h1 = h1.next;
        }
        while(h1 != null){
            h1 = h1.next;
            h2 = h2.next;
        }
        return h2.data;
    }
    
    public static void main(String[] args)
    {
        List head = null;
        D_Insert_At_End d = new D_Insert_At_End();
        for(int i=1;i<=10;i++){
            head = d.insert(head, i);
        }
        System.out.println(find(head, 3));
    }
    
}
