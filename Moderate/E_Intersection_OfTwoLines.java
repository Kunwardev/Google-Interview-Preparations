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
class Point{
    
    public double x, y;
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void setLocation(double x, double y){
        this.x = x;
        this.y = y;
    }
    
}

class Line{
    
    public double slope, yintercept;
    
    public Line(Point start, Point end){
        double deltax = end.x - start.x;
        double deltay = end.y - start.y;
        this.slope = deltay/deltax;
        this.yintercept = end.y - (this.slope * end.x);
    }
    
}

public class E_Intersection_OfTwoLines
{
    private void swap(Point x, Point y){
        double a = x.x;
        double b = x.y;
        x.setLocation(y.x, y.y);
        y.setLocation(a,b);
    }
    
    private Point intersection(Point start1, Point end1, Point start2, Point end2){
        
        if(start1.x > end1.x)
            swap(start1, end1);
        if(start2.x > end2.x)
            swap(start2, end2);
        if(start1.x > start2.x){
            swap(start1, start2);
            swap(end1, end2);
        }
        
        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);
        
        if(line1.slope == line2.slope){
            if((line1.yintercept == line1.yintercept) && (isBetween(start1, start2, end2))){
                return start2;
            }
            return null;
        }
        
        double x = (line2.yintercept - line1.yintercept)/(line1.slope - line2.slope);
        double y = x * line1.slope + line1.yintercept;
        Point intersection = new Point(x, y);
        if(isBetween(start1, intersection, end1) && isBetween(start2, intersection, end2))
            return intersection;
        return null;
    }

    public static void main(String[] args)
    {
        Point x1 = new Point(0, 3);
        Point y1 = new Point(2, 7);
        Point x2 = new Point(0, 7);
        Point y2 = new Point(2, 6);
        E_Intersection_OfTwoLines e = new E_Intersection_OfTwoLines();
        Point l = (e.intersection(x1, y1, x2, y2));
        System.out.println(l.x+" "+l.y);
    }

    private boolean isBetween(double start, double middle, double end){
        if(start > end)
            return (end <= middle && middle <= start);
        return (start <= middle && middle <= end);
    }
    
    private boolean isBetween(Point start, Point middle, Point end)
    {
        return (isBetween(start.x, middle.x, end.x) && isBetween(start.y, middle.y, end.y));
    }
    
}
