/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Moderate;

/**
 *
 * @author Kunwar
 */
class Square{
    private double left, right, bottom, top, size;

    public Square(double left, double top, double size){
        this.left = left;
        this.top = top;
        this.bottom = top + size;
        this.right = left + size;
    }
    
    public Point middle(){
        return new Point((this.left+this.right)/2, (this.top+this.bottom)/2);
    }
    
    public Point extend(Point mid1, Point mid2, double size){
        double xdir = mid1.x < mid2.x ? -1 : 1;
        double ydir = mid1.y < mid2.y ? -1 : 1;
        if(mid1.x == mid2.x)
            return new Point(mid1.x, (mid1.y + mid2.y)/2);
        double slope = (mid1.y - mid2.y)/(mid1.x - mid2.x);
        double x1 = 0, y1 = 0;
        if(Math.abs(slope) == 1){
            x1 = mid1.x + xdir*size/2;
            y1 = mid1.y + ydir*size/2;
        }else if(Math.abs(slope) < 1){
            x1 = mid2.x + xdir * size/2;
            y1 = slope * (x1 - mid1.x) + mid1.y;
        }else{
            y1 = mid1.y + ydir * size / 2;
            x1 = (y1 - mid1.y)/slope + mid1.x;
        }
        return new Point(x1, y1);
    }
    
    public Line cut(Square other){
        Point p1 = extend(this.middle(), other.middle(), this.size);
        Point p2 = extend(this.middle(), other.middle(), -1 * this.size);
        Point p3 = extend(this.middle(), other.middle(), other.size);
        Point p4 = extend(this.middle(), other.middle(), -1 * other.size);
        
        Point start = p1;
        Point end = p1;
        Point[] points = {p2, p3, p4};
        
        for(int i=0;i<points.length;i++){
            if(points[i].x < start.x || (points[i].x == start.x && points[i].y < start.y))
                start = points[i];
            else if(points[i].x > end.x || (points[i].x == end.x && points[i].y > end.y)){
                end = points[i];
            }
        }
        return new Line(start, end);
    }
    
}

public class E_Bisect_Squares
{
    static Square s1 = new Square(4, 3, 5);
    static Square s2 = new Square(2, 5, 3);
    public static void main(String[] args)
    {
        System.out.println(s1.cut(s2).yintercept);
    }
}
