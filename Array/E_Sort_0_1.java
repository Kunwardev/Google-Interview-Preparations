/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

/**
 *
 * @author Kunwar
 */
public class E_Sort_0_1
{
    private void sort012(int[] arr, int n){
        int lo = 0;
        int high = n-1;
        int mid = 0, temp = 0;
        while(mid <= high){
            switch(arr[mid]){
                case 0:
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }
    
    private void printArray(int[] arr){
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{0,1,1,1,2,2,2,0,1,1,0,2};
        E_Sort_0_1 e = new E_Sort_0_1();
        e.sort012(arr, arr.length);
        e.printArray(arr);
    }
    
}
