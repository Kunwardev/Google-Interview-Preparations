/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

/**
 *
 * @author Kunwar
 */

public class C_Stacks_in_One_Array
{
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] size = new int[numberOfStacks];
    private int[] top = new int[numberOfStacks];
    private int[] bottom = new int[numberOfStacks];
    
    public C_Stacks_in_One_Array(int sizes)
    {
        values = new int[sizes * numberOfStacks];
        size[0] = -1; size[1] = sizes-1; size[2] = 2*sizes-1;
        top[0] = sizes-1; top[1] = 2*sizes-1;top[2] = 3*sizes-1;
        bottom[0] = -1;bottom[1] = sizes - 1;bottom[2] = 2*sizes - 1;
    }
    
    private void push(int Stack, int value){
        if(size[Stack] == top[Stack]){
            System.out.println("There is Overflow in Stack "+Stack+", ERROR");
            return;
        }else{
            values[++size[Stack]] = value;
        }
    }
    
    private int pop(int Stack){
        if(size[Stack] == bottom[Stack]){
            System.out.println("There is Underflow in Stack "+Stack+", ERROR");
            return -1;
        }else{
            return values[size[Stack]--];
        }
    }
    
    private int topOfStack(int Stack){
        if(size[Stack] == bottom[Stack])
            return -1;
        return values[size[Stack]];
    }
    
    private void printStack(int Stack){
        for(int i=bottom[Stack]+1;i<=size[Stack];i++){
            System.out.print(values[i]+" "); 
        }System.out.println();
    }
    
    public static void main(String[] args)
    {
        C_Stacks_in_One_Array c = new C_Stacks_in_One_Array(2);
        c.push(0, 1);c.push(0, 1);c.push(1, 2);c.push(1, 6);c.push(2, 1);c.push(2, 1);
        c.printStack(0);c.printStack(1);c.printStack(2);
        System.out.println(c.topOfStack(1));
    }
    
}
