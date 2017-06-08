/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backtracking;

/**
 *
 * @author Kunwar
 */
public class D_Sudoku
{
    private static boolean usedInCol(int[][] grid, int col, int num){
        for(int row = 0;row<9 ;row++){
            if(grid[row][col] == num)
                return true;
        }
        return false;
    }
    
    private static boolean usedInRow(int[][] grid, int row, int num){
        for(int col = 0; col<9;col++){
            if(grid[row][col] == num)
                return true;
        }
        return false; 
    }
    
    private static boolean usedInBox(int[][] grid, int row, int col, int num){
        for(int boxrow=0;boxrow<3;boxrow++){
            for(int boxcol=0;boxcol<3;boxcol++){
                if(grid[row+boxrow][col+boxcol] == num)
                    return true;
            }
        }
        return false;
    }
    
    private static int[] unAssgined(int[][] grid){
        int[] arr = new int[]{9,9};
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                if(grid[i][j] == 0){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
        }
        return arr;
    }
    
    private static boolean solveSudoku(int[][] grid){
        int[] arr = unAssgined(grid);
        if(arr[0] == 9 && arr[1] == 9)
            return true;
        for(int num = 1;num <= 9;num++){
            if(!usedInRow(grid, arr[0], num) && !usedInCol(grid, arr[1], num) && !usedInBox(grid, arr[0]-arr[0]%3, arr[1]-arr[1]%3, num)){
                grid[arr[0]][arr[1]] = num;
                if(solveSudoku(grid))
                    return true;
                grid[arr[0]][arr[1]] = 0;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[][] grid = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        
        if(solveSudoku(grid))
            printSolution(grid);
        else{
            System.out.println("Not Possible");
        }
    }

    private static void printSolution(int[][] grid)
    {
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++)
                System.out.print(grid[i][j]+" ");
            System.out.println();
        }
    }
}
