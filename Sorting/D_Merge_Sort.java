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
public class D_Merge_Sort
{
    static int count = 0;
    public static void merge(int arr[],int l,int m,int r)
    {
        int i,j,k;
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(i=0;i<n1;i++)
        {
            L[i] = arr[l+i];
        }
        for(j=0;j<n2;j++)
        {
            R[j] = arr[m+1+j];
        }
        i = 0;j=0;k=l;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];i++;
            }
            else{
                arr[k] = R[j];j++;count++;}
            k++;
        }
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
        public static void sort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int mid = (l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = new int[]{9,5,1,7,3,6,2};
        sort(arr, 0, arr.length-1);
        for(int k: arr)
            System.out.print(k+" ");
    }
    
    
}
