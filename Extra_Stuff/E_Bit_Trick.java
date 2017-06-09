/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Extra_Stuff;

/**
 *
 * @author Kunwar
 */
public class E_Bit_Trick
{
    private static int clear_all_bits_from_LSB_to_ith_bit(int x, int i){
        int mask = ~((1 << i+1) - 1);
        x &= mask;
        return x;
    }
    
    private static int clear_all_bits_from_MSB_to_ith_bit(int x, int i){
        int mask = (1 << i) - 1;
        x &= mask;
        return x;
    }
    
    private static int count_bits(int x){
        int count = 0;
        while(x > 0){
            x &= (x-1);
            count++;
        }
        return count;
    }
    
    private static int log2(int x){
        int res = 0;
        while((x = x>>1) > 0){
            res++;
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        int x = 29;
        System.out.println(x);
        int y = clear_all_bits_from_LSB_to_ith_bit(x, 3);
        System.out.println(x+" "+y);
        y = clear_all_bits_from_MSB_to_ith_bit(x, 3);
        System.out.println(x+" "+y);
        System.out.println(count_bits(x));
        System.out.println(log2(4));
        
    }
    
}
