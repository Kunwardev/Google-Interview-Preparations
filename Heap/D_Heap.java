/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Heap;

/**
 *
 * @author Kunwar
 */
public class D_Heap
{
    public int[] heap_array;
    private int count;
    private int capacity;
    
    public D_Heap(int capacity){
        this.capacity = capacity;
        this.count = 0;
        this.heap_array = new int[capacity];
    }
    
    private int parent(int i){
        return (i-1)/2;
    }
    
    private int leftChild(int i){
        if((2*i+1) > this.capacity){
            return -1;
        }
        return (2*i+1);
    }
    
    private int rightChild(int i){
        if((2*i+2) > this.capacity){
            return -1;
        }
        return (2*i+2);
    }
    
    private int getMin(){
        if(this.count != 0)
            return this.heap_array[0];
        else
            return -1;
    }
    
    private void Heapify(int i){
        int l, r, min, temp;
        min = i;
        l = leftChild(i);
        r = rightChild(i);
        if(l != -1 && this.heap_array[l] < this.heap_array[min])
            min = l;
        if(r != -1 && this.heap_array[r] < this.heap_array[min])
            min = r;
        
        if(min != i){
            temp = this.heap_array[min];
            this.heap_array[min] = this.heap_array[i];
            this.heap_array[i] = temp;
            Heapify(min);
        }
    }
    
    private int deleteMin(){
        if(this.count == 0)
            return -1;
        int data = this.heap_array[0];
        this.heap_array[0] = this.heap_array[this.count-1];
        this.heap_array[this.count-1] = data;
        this.count--;
        Heapify(0);
        return data;
    }

    private void insert(int data){
        this.heap_array[this.count] = data;
        int i = this.count;
        this.count++;
        while(i > 0 && this.heap_array[i] < this.heap_array[parent(i)]){
            int temp = this.heap_array[i];
            this.heap_array[i] = this.heap_array[parent(i)];
            this.heap_array[parent(i)] = temp;
            i = parent(i);
        }
    }
    
    private void sort(){
        System.out.println(this.deleteMin());
        System.out.println(this.deleteMin());
        System.out.println(this.deleteMin());
    }
    
    public static void main(String[] args)
    {
        D_Heap l = new D_Heap(7);
        l.insert(4);
        l.insert(7);
        l.insert(2);
        l.insert(8);
        l.insert(9);
        l.insert(5);
        l.insert(1);
//        for(int i=0;i<l.count;i++){
//            System.out.print(l.heap_array[i]+" ");
//        }
        l.sort();
    }
    
}
