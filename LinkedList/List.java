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
public class List
{
    public int data;
    public List next;
    
    List(int data){
        this.data = data;
        this.next = null;
    }
    
    List(){
        this.data = 0;
        this.next = null;
    }
    
    public List getNext(){
        return this.next;
    }
    
    public void setNext(List temp){
        this.next = temp;
    }
    
    public int getData(){
        return this.data;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
}
