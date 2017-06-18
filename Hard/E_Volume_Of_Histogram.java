/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hard;

/**
 *
 * @author Kunwar
 */
public class E_Volume_Of_Histogram
{
    private int computeHistogramVolume(int[] histogram){
        int[] leftMaxes = new int[histogram.length];
        int[] rightMaxes = new int[histogram.length];
        int leftMax = histogram[histogram.length-1];
        for(int i=0;i<histogram.length;i++){
            leftMax = Math.max(leftMax, histogram[i]);
            leftMaxes[i] = leftMax;
        }
        int sum = 0;
        int rightMax = histogram[histogram.length-1];
        for(int i=histogram.length-1;i>=0;i--){
            rightMax = Math.max(rightMax, histogram[i]);
            int secondTallest = Math.min(rightMax, leftMaxes[i]);
            if(secondTallest > histogram[i])
                sum += secondTallest - histogram[i];
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        E_Volume_Of_Histogram e = new E_Volume_Of_Histogram();
        int[] histogram = new int[]{0,0,4,0,0,6,0,0,3,0,5,0,1,0,0,0};
        System.out.println(e.computeHistogramVolume(histogram));
    }
    
}
