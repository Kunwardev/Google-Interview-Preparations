/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */

/*
1) Convert each number to base-3. Let's say the longest number has k digits (in base-3)
2) for all k digits, sum up all of the digits in the kth slot, and then take the result
modulo 3. The resulting digits make up the element that only occurs once.
*/

public class D_Finding_Array_With_ThreeTimes
{
    private static String convert_to_base_3(int i){
        StringBuilder sb = new StringBuilder();
        while(i > 0){
            sb.append(i%3);
            i /= 3;
        }
        return sb.reverse().toString();
    }
    
    private static int convert_to_base_2(int x){
        int i = 0,number = 0;
        while(x != 0){
            number += (x%10*Math.pow(3, i++));
            x /= 10;
        }
        return number;
    }   
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,5,3,4,3,2,1};
        System.out.println(find(arr));
    }

    private static int find(int[] arr)
    {
        String[] new_arr = new String[arr.length];
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            new_arr[i] = convert_to_base_3(arr[i]);
            if(new_arr[i].length() > maxLength)
                maxLength = new_arr[i].length();
        }
        int[] summations = get_Sum_Index(new_arr,maxLength);
        StringBuilder s = new StringBuilder();
        for(int k: summations)
            s.append(k);
        int result = Integer.parseInt(s.reverse().toString());
        return (convert_to_base_2(result));
    }

    private static int[] get_Sum_Index(String[] new_arr, int maxLength)
    {
        int[] sums = new int[maxLength];
        int[] converted = converted(new_arr);
        Arrays.fill(sums, 0);
        for(int i=0;i<maxLength;i++){
            for(int j=0;j<new_arr.length;j++){
                sums[i] += (converted[j]%10);
                converted[j]/=10;
            }
            sums[i] %=3;
        }
        return sums;
    }

    private static int[] converted(String[] new_arr)
    {
        int[] arr = new int[new_arr.length];
        for(int i=0;i<new_arr.length;i++){
            arr[i] = Integer.parseInt(new_arr[i]);
        }
        return arr;
    }
}
