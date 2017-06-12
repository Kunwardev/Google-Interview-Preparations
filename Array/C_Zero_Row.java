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
public class C_Zero_Row
{
    private void matZero(int[][]mat){
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        Arrays.fill(row, 1);Arrays.fill(col, 1);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(row[i] == 0 || col[j] == 0){
                    mat[i][j] = 0;
                }
            }
        }
    }
    
    private void printMatrix(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        int[][] mat = new int[][]{{1,2,3,0},{4,5,6,7},{8,9,10,11},{0,12,13,14}};
        C_Zero_Row c = new C_Zero_Row();
        c.printMatrix(mat);
        System.out.println();System.out.println();
        c.matZero(mat);
        c.printMatrix(mat);
    }
    
}
