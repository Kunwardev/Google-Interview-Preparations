/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

/**
 *
 * @author Kunwar
 */
public class E_Count_Paths_From_Origin
{
    private int countPaths(int n, int m){
        int[][] count = new int[n+1][m+1];
        if(n == 0 || m == 0)
            return 1;
        for(int i=0;i<=n;i++)
            count[i][0] = 1;
        for(int j=0;j<=m;j++)
            count[0][j] = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=m;j++){
                count[i][j] = count[i-1][j] + count[i][j-1];
            }
        }
        return count[n][m];
    }
    
    public static void main(String[] args)
    {
        int n = 3 , m = 6;
        E_Count_Paths_From_Origin e = new E_Count_Paths_From_Origin();
        System.out.println(e.countPaths(n, m));
    }
    
}
