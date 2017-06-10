/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dynamic_Programming;

import java.util.Comparator;

/**
 *
 * @author Kunwar
 */
public class Comp_Box implements Comparator<Box>
{

    public int compare(Box o1, Box o2)
    {
        if(o1.area > o2.area)
            return 1;
        else
            return -1;
    }
    
}
