/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class E_CopyLinkedListHashMap
{
    private HashMap<RandomListNode, RandomListNode> map(RandomListNode r){
        HashMap<RandomListNode, RandomListNode> hm = new HashMap<>();
        while(r != null){
            hm.put(r, r.random);
            r = r.next;
        }
        return hm;
    }
    
    private RandomListNode deepcopy(RandomListNode head){
        E_CopyLinkedListHashMap e = new E_CopyLinkedListHashMap();
        HashMap<RandomListNode, RandomListNode> x = e.map(head);
        RandomListNode copy;
        RandomListNode temp = new RandomListNode(head.value);
        temp.random = x.get(head);
        copy = temp;
        temp = temp.next;
        head = head.next;
        while(head != null){
            temp = new RandomListNode(head.value);
            temp.random = x.get(head);
            temp = temp.next;
            head = head.next;
        }
        return copy;
    }
    
    private void traverse(RandomListNode head){
        while(head != null){
            System.out.println(head.value+" "+head.random.value);
            head = head.next;
        }
    }
    
    public static void main(String[] args)
    {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.next.next = new RandomListNode(3);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next;
        E_CopyLinkedListHashMap e = new E_CopyLinkedListHashMap();
        RandomListNode r = e.deepcopy(head);
        e.traverse(head);
    }
    
    
}
