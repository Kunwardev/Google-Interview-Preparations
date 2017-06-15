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
public class E_Median_Of_Two_Sorted_Arrays
{
    private double findMedianSortedArray(int[] A, int[] B){
        int m = A.length;
        int n = B.length;
        
        if((m+n)%2 != 0)
            return (double)findKth(A, B, (m+n)/2, 0, m-1, 0, n-1);
        else
            return ((double)findKth(A, B, (m+n)/2, 0, m-1, 0, n-1)+
                    (double)findKth(A, B, (m+n)/2-1, 0, m-1, 0, n-1))*0.5;
    }
    
    private int findKth(int[] A, int[] B, int k, int astart, int aend, int bstart, int bend){
        
        int alen = aend - astart + 1;
        int blen = bend - bstart + 1;
        
        if(alen == 0)
            return B[bstart+k];
        if(blen == 0)
            return A[astart+k];
        if(k == 0){
            return A[astart] < B[bstart] ? A[astart] : B[bstart];
        }
        int aMid = (alen + k)/(alen+blen);
        int bMid = k - aMid - 1;
        
        aMid = aMid + astart;
        bMid = bMid + bstart;
        
        if(A[aMid] > B[bMid]){
            k = k - (bMid - bstart + 1);
            aend = aMid;
            bstart = bMid + 1;
        }else{
            k = k - (aMid - astart + 1);
            bend = bMid;
            astart = aMid + 1;
        }
        return findKth(A, B, k, astart, aend, bstart, bend);
    }
    
    public static void main(String[] args)
    {
        int[] A = new int[]{1,2,5,6};
        int[] B = new int[]{3,4,8};
        E_Median_Of_Two_Sorted_Arrays e = new E_Median_Of_Two_Sorted_Arrays();
        System.out.println(e.findMedianSortedArray(A, B));
    }
    
}
