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
public class Box
{
    int l,w,h,area;
    Box(int l,int w,int h){
        this.l = l;
        this.w = w;
        this.h = h;
        this.area = l*w;
    }
}
