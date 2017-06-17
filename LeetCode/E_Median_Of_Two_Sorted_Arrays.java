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
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int total = nums1.length+nums2.length;
    if(total%2==0){
        return (findKth(total/2+1, nums1, nums2, 0, 0)+findKth(total/2, nums1, nums2, 0, 0))/2.0;
    }else{
        return findKth(total/2+1, nums1, nums2, 0, 0);
    }
}
 
public int findKth(int k, int[] nums1, int[] nums2, int s1, int s2){
    if(s1>=nums1.length)
        return nums2[s2+k-1];
 
    if(s2>=nums2.length)
        return nums1[s1+k-1];
 
    if(k==1)
        return Math.min(nums1[s1], nums2[s2]);
 
    int m1 = s1+k/2-1;
    int m2 = s2+k/2-1;
 
    int mid1 = m1<nums1.length?nums1[m1]:Integer.MAX_VALUE;    
    int mid2 = m2<nums2.length?nums2[m2]:Integer.MAX_VALUE;
 
    if(mid1<mid2){
        return findKth(k-k/2, nums1, nums2, m1+1, s2);
    }else{
        return findKth(k-k/2, nums1, nums2, s1, m2+1);
    }
}
    public static void main(String[] args)
    {
        int[] A = new int[]{1,2};
        int[] B = new int[]{3,4};
        E_Median_Of_Two_Sorted_Arrays e = new E_Median_Of_Two_Sorted_Arrays();
        System.out.println(e.findMedianSortedArrays(A, B));
    }
    
}
