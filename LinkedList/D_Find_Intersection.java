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
public class D_Find_Intersection
{
    private static int length(List head){
        List a = head;
        int counter = 0;
        while(a != null){
            a = a.next;
            counter++;
        }
        return counter;
    }
    
    private static List function(List head_a, List head_b){
        List a = head_a;
        List b = head_b; 
        int length_a = length(a);
        int length_b = length(b);
        
        if(length_a > length_b){
            int diff = length_a - length_b;
            for(int i=0;i<diff;i++)
                a = a.next;
        }else{
            int diff = length_b - length_a;
            for(int i=0;i<diff;i++)
                b = b.next;
        }
        while(a!= null && b!= null){
            System.out.println(a+" "+b);
            if(a == b){
                System.out.println(a);
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        List head_a = new List(1);
        List head_b = new List(10);
        head_a.next = new List(3);
        head_b.next = new List(5);
        head_a.next.next = new List(7);
        head_a.next.next.next = new List(5);
        head_b.next.next = head_a.next;
        System.out.println(function(head_a, head_b).data);
        
    }
    
}
