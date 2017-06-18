/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class E_pond_Size
{
    
    private ArrayList<Integer> function(int[][] mat){
        ArrayList<Integer> al = new ArrayList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        for(int r=0;r<mat.length;r++){
            for(int c=0;c<mat[0].length;c++){
                int size = computeSize(mat, visited, r, c);
                if(size > 0)
                    al.add(size);
            }
        }
        return al;
    }
    
    public static void main(String[] args)
    {
        int[][] mat = new int[][]{{0,2,1,0},{0,1,0,1},{1,1,0,1},{0,1,0,1}};
        E_pond_Size e = new E_pond_Size();
        System.out.println(e.function(mat));
    }

    private int computeSize(int[][] mat, boolean[][] visited, int r, int c)
    {
        if(r < 0 || c < 0 || r>=mat.length || c>=mat[0].length || visited[r][c] || 
                mat[r][c] != 0)
            return 0;
        int size = 1;
        visited[r][c] = true;
        for(int dr = -1;dr <= 1;dr++){
            for(int dc = -1;dc <= 1;dc++){
                size += computeSize(mat, visited, r+dr, c+dc);
            }
        }
        return size;
    }
    
    
}
