/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class C_Find_Path
{
    private ArrayList<Point> getPath(boolean[][]maze){
        if(maze == null && maze.length == 0)
            return null;
        ArrayList<Point> path = new ArrayList<>();
        HashMap<Point, Boolean> cache = new HashMap<>();
        int lastRow = maze.length - 1;
        int lastCol = maze[0].length - 1;
        if(getPath(maze, lastRow, lastCol, path, cache))
            return path;
        return null;
    }

    private boolean getPath(boolean[][] maze, int lastRow, int lastCol, ArrayList<Point> path, HashMap<Point, Boolean> cache)
    {
        if(lastRow < 0 || lastCol < 0 || !maze[lastRow][lastCol])
            return false;
        Point p = new Point(lastRow, lastCol);
        if(cache.containsKey(p))
            return cache.get(p);
        boolean isAtOrigin = (lastRow == 0 && lastCol == 0);
        boolean success = false;
        if(isAtOrigin || getPath(maze, lastRow-1, lastCol, path, cache)||
                getPath(maze, lastRow, lastCol-1, path, cache)){
            path.add(p);
            success = true;
        }
        cache.put(p, success);
        return success;
    }
    
    public static void main(String[] args)
    {
        boolean[][] matrix = new boolean[][]{{true, true, false, true},
                                             {false, true, true, false},
                                             {true, true, true, true},
                                             {false, true, true, true}};
        C_Find_Path c = new C_Find_Path();
        ArrayList<Point> al = c.getPath(matrix);
        System.out.println(al);
    }
    
}
