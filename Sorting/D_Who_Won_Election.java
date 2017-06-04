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
public class D_Who_Won_Election
{
    private static int WinningID(int[] ids){
        D_Heap_Sort d = new D_Heap_Sort();
        d.sort(ids);
        int currentCount = 0,maxCount = 0,id=-1;
        for(int i=0;i<ids.length-1;i++){
            if(ids[i] == ids[i+1]){
                currentCount++;
                if(maxCount < currentCount){
                    id = ids[i];
                    maxCount = currentCount;
                }
            }else{
                currentCount = 0;
            }
        }
        return id;
    }
    
    public static void main(String[] args)
    {
        int[] id = new int[]{5,4,5,5,5,5,4,4,4,4,2,3,4,4,1};
        System.out.println(WinningID(id));
    }
    
}
