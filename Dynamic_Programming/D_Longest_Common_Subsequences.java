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
public class D_Longest_Common_Subsequences
{
    private String LCSLength(String x, String y){
        int[][] Table = new int[x.length()+1][y.length()+1];
        for(int i=0;i<x.length();i++){
            for(int j=0;j<y.length();j++){
                if(x.charAt(i)==y.charAt(j)){
                    Table[i+1][j+1] = Table[i][j] + 1; 
                }else
                    Table[i+1][j+1] = Math.max(Table[i+1][j],Table[i][j+1]);
            }
        }
            StringBuilder sb = new StringBuilder();
            for(int a=x.length(),b=y.length();a!=0&&b!=0;){
                if(Table[a][b] == Table[a-1][b])
                    a--;
                else if(Table[a][b] == Table[a][b-1])
                    b--;
                else{
                    sb.append(x.charAt(a-1));
                    a--;b--;
                }
            }
            return sb.reverse().toString();
        }

    public static void main(String[] args)
    {
        String x = "ABCBDAB";
        String y = "BDCABA";
        D_Longest_Common_Subsequences s = new D_Longest_Common_Subsequences();
        System.out.println(s.LCSLength(x, y));
    }
    
    }
