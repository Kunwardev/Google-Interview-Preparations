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
public class E_EnglishIntMyMethod
{
    String[] units = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight"
                    ,"Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
                    "Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy",
                    "Eighty","Ninety"};
    String hundred = "Hundred";
    String thousand = "Thousand";
    String negative = "negative";
    
    private void convert(int x){
        if(x < 0)
            System.out.print(negative+" ");
        x = -x;
        while(x != 0){
                if(x >= 1000){
                int l = x/1000;
                x = x%1000;
                System.out.print(units[l]+" "+thousand+" ");
            }else{
            if(x >= 100){
                int u = x/100;
                x = x % 100;
                System.out.print(units[u]+" "+hundred+" ");
            }else{
                if(x >= 20){
                    int y = x/10;
                    x = x % 20;
                    System.out.print(tens[y]+" ");
                }else{
                        System.out.println(units[x]);
                        x = 0;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        int x = -1266;
        E_EnglishIntMyMethod e = new E_EnglishIntMyMethod();
        e.convert(x);
    }
    
}
