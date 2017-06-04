/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

/**
 *
 * @author Kunwar
 */
public class D_Heap_Sort
{
    public static void Heapify(int arr[],int n,int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l] > arr[largest])
            largest = l;
        if(r<n && arr[r] > arr[largest])
            largest = r;
        if(largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Heapify(arr,n,largest);
        }
    }
    
    public static void sort(int arr[])
    {
        for(int i=arr.length/2-1;i>=0;i--)
            Heapify(arr, arr.length,i);
        for(int i=arr.length-1;i>=0;i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            Heapify(arr, i,0);
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{8,4,2,6,9,1,3};
        sort(arr);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
