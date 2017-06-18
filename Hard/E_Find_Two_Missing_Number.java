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
public class E_Find_Two_Missing_Number
{
    
    private int[] findNumber(int[] arr){
        int[] result = new int[2];
        int xor = 0;
        for(int l: arr)
            xor ^= l;
        int set_bit_no = xor &~(xor-1);
        for(int i=0;i<arr.length;i++){
            if((arr[i] & set_bit_no) > 0)
                result[0] ^= arr[i];
            else
                result[1] ^= arr[i];
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 3, 7, 9, 11, 2, 3, 11};
        E_Find_Two_Missing_Number e = new E_Find_Two_Missing_Number();
        int[] result = e.findNumber(arr);
        System.out.println(result[0]+" "+result[1]);
    }
    
}
