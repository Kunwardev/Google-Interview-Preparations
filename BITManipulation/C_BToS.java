/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BITManipulation;

/**
 *
 * @author Kunwar
 */
public class C_BToS
{
    private String convert(float x){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(x > 0 && count < 32){
            x = x*2;
            if(x >=1 ){
                sb.append(1);
                x = x - 1;
            }else{
                sb.append(0);
            }
            count++;
        }
        if(count == 32)
            return "ERROR";
        return sb.toString();
    }
    
    public static void main(String[] args)
    {
        C_BToS c = new C_BToS();
        System.out.println("0."+c.convert(0.625f));
    }
    
}
