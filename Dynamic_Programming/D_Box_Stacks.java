/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class D_Box_Stacks
{
    // This program will tell you the number of boxes that can be kept on one another areawise
    private Box[] makeArrays(Box[] a){
        Box[] s = new Box[3*a.length];
        int p = 0;
        for(int i=0;i<a.length;i++){
            s[p] = new Box(a[i].l, a[i].w, a[i].h);
            s[p+1] = new Box(a[i].w, a[i].h, a[i].l);
            s[p+2] = new Box(a[i].l, a[i].h, a[i].w);
            p+=3;
        }
        Comp_Box c = new Comp_Box();
        Arrays.sort(s, c);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].area);
        }
        return s;
    }
    
    public static void main(String[] args)
    {
        Box[] a = new Box[4];
        a[0] = new Box(4,6,7);
        a[1] = new Box(1,2,3);
        a[2] = new Box(4,5,6);
        a[3] = new Box(10,12,32);
        D_Box_Stacks d = new D_Box_Stacks();
        Box[] finals = d.makeArrays(a);
        int max = Integer.MIN_VALUE;
        int[] LIS = new int[finals.length];
        Arrays.fill(LIS,1);
        for(int i=0;i<finals.length;i++){
            for(int j=0;j<i;j++){
                if(finals[i].area > finals[j].area && LIS[i] < LIS[j]){
                    LIS[i] = LIS[j] + 1;
                    if(max < LIS[i])
                        max = LIS[i];
                }
            }
        }
        System.out.println(max);
    }
    
}

