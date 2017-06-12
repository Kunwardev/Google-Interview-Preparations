/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Array;

/**
 *
 * @author Kunwar
 */
public class C_OneAway
{
    private static boolean oneEditAway(String a, String b){
        if(a.length() == b.length())
            return oneEditReplace(a, b);
        else if(a.length()+1 == b.length())
            return oneEditInsert(a, b);
        else if(a.length() == b.length()+1)
            return oneEditRemove(a, b);
        return false;
    }

    private static boolean oneEditReplace(String a, String b)
    {
        boolean foundOne = false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                if(foundOne)
                    return false;
                foundOne = true;
            }
        }
        return true;
    }

    private static boolean oneEditInsert(String a, String b)
    {
        int index_1 = 0,index_2 = 0;
        while(index_2 < b.length() && index_1 < a.length()){
            if(a.charAt(index_1) != b.charAt(index_2)){
                if(index_1 != index_2)
                    return false;
                index_2++;
            }else{
                index_1++;index_2++;
            }
        }
        return true;
    }

    private static boolean oneEditRemove(String a, String b)
    {
        int index_1 = 0, index_2 = 0;
        while(index_1 < a.length() && index_2 < b.length()){
            if(a.charAt(index_1) != b.charAt(index_2)){
                if(index_1 != index_2)
                    return false;
                index_1++;
            }else{
                index_1++;index_2++;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        String a = "pale";
        String b = "bae";
        System.out.println(oneEditAway(a, b));
    }
    
}

