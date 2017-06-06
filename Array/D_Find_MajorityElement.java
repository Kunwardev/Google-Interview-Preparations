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
class max{
    static int data, freq;
}
// Moore's Voting Algorithm
public class D_Find_MajorityElement
{
    private static int find(int[] arr){
        max m = new max();
        m.data = arr[0];
        m.freq = 1;
        for(int i=1;i<arr.length;i++){
            if(m.data != arr[i]){
                m.freq--;
                if(m.freq == 0){
                    m.data = arr[i];
                    m.freq = 1;
                }
            }else
                m.freq++;
        }
        return m.data;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,2,2,2,2,3,1,1,2};
        System.out.println(find(arr));
    }
    
}
