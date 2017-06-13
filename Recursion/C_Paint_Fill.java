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
public class C_Paint_Fill
{
    private boolean isSafe(int[][] mat, int row, int col){
        if(row < 0 || row >= mat.length || col < 0 || col >= mat[0].length){
            return false;
        }
        return true;
    }
    
    private void fillColor(int[][] mat, int startRow, int startCol){
        if(isSafe(mat, startRow, startCol)){
                if(mat[startRow][startCol] == 0){
                mat[startRow][startCol] = 2;
                fillColor(mat, startRow+1, startCol);
                fillColor(mat, startRow-1, startCol);
                fillColor(mat, startRow, startCol+1);
                fillColor(mat, startRow, startCol-1);
            }
        }
        return;
    }
    
    private void print(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        int[][] mat = new int[][]{{0,1,0,0,0,0},
                                  {0,1,0,0,0,0},
                                  {1,1,1,0,0,0},
                                  {0,0,0,1,1,0},
                                  {0,0,0,0,0,1},
                                  {0,0,0,0,0,0}};
        C_Paint_Fill c = new C_Paint_Fill();
        c.fillColor(mat, 2, 3);
        c.print(mat);
    }
    
}
