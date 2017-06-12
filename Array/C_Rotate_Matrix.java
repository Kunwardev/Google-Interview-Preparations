/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

/**
 *
 * @author Kunwar
 */
public class C_Rotate_Matrix
{
    private void rotate(int[][] mat, int n){
        for(int layer = 0;layer<n/2;layer++){
            int first = layer;
            int last = n-1-first;
            for(int i=first;i<last;i++){
                int offset = i-first;
                int top = mat[first][i];
                mat[first][i] = mat[last-offset][first];
                mat[last-offset][first] = mat[last][last-offset];
                mat[last][last-offset] = mat[i][last];
                mat[i][last] = top;
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
        int[][] mat = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        C_Rotate_Matrix c = new C_Rotate_Matrix();
        c.printMatrix(mat);
        c.rotate(mat, 4);
        System.out.println();
        c.printMatrix(mat);
    }
    
}
