/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
public class E_CopyLinkedListN
{
    public RandomListNode copy(RandomListNode head){
        if (head == null)
		return null;
 
	RandomListNode p = head;
 
	// copy every node and insert to list
	while (p != null) {
		RandomListNode copy = new RandomListNode(p.value);
		copy.next = p.next;
		p.next = copy;
		p = copy.next;
	}
 
	// copy random pointer for each new node
	p = head;
	while (p != null) {
		if (p.random != null)
			p.next.random = p.random.next;
		p = p.next.next;
	}
 
	// break list to two
	p = head;
	RandomListNode newHead = head.next;
	while (p != null) {
		RandomListNode temp = p.next;
		p.next = temp.next;
		if (temp.next != null)
			temp.next = temp.next.next;
		p = p.next;
	}
 
	return newHead;
    }
    
    private void traverse(RandomListNode head){
        RandomListNode h = head;
        while(h != null){
            System.out.println("Value: "+h.value+" Random: "+h.random.value);
            h = h.next;
        }
    }
    
    
    
    
    public static void main(String[] args)
    {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.next.next = new RandomListNode(3);
        head.next.next.next = new RandomListNode(4);
        head.next.next.next.next = new RandomListNode(5);
        head.random = head.next.next;
        head.next.random = head.next.next.next.next;
        head.next.next.random = head.next;
        head.next.next.next.random = head;
        head.next.next.next.next.random = head.next.next.next;
        E_CopyLinkedListN e = new E_CopyLinkedListN();
        RandomListNode r = e.copy(head);
        e.traverse(head);
        System.out.println();
        
    }
    
}
