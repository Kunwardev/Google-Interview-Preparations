/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author Kunwar
 */
public class C_Power_Sets
{
    private void power(int[] set){
        boolean[] mat = new boolean[set.length];
        powerHelper(set, mat, 0, set.length);
    }

    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3};
        C_Power_Sets c = new C_Power_Sets();
        c.power(arr);
    }

    private void powerHelper(int[] set, boolean[]mat, int i, int length)
    {
        if(i == length){
            printArray(set,mat);
            return;
        }else{
            powerHelper(set, mat, i+1, length);
            mat[i] = true;
            powerHelper(set, mat, i+1, length);
            mat[i] = false;
        }
    }

    private void printArray(int[] set, boolean[] mat)
    {
        for(int i=0;i<mat.length;i++){
            if(mat[i] == true)
                System.out.print(set[i]+" ");
        }System.out.println();
    }
}
