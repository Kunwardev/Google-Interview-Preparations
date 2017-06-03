/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class D_Saving_Address_Of_Class
{
    class check{
        int data;
        String p;
        
        check(int data, String q){
            this.data = data;
            this.p = q;
        }
    }
    
    private void Check(){
        check a = new check(45, "Address");
        HashMap<Integer, Object> hm = new HashMap<>();
        hm.put(1, a);
        System.out.println(hm);
    }
    
    public static void main(String[] args)
    {
        D_Saving_Address_Of_Class d = new D_Saving_Address_Of_Class();
        d.Check();
    }
    
}
