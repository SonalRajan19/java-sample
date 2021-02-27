/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_handling;

/**
 *
 * @author SONAL L R
 */
public class Throw_block2 {
    public static void main(String[] args){
        try
        {
            int a=30,b=20;
            if(a<b)
                throw new ArithmeticException("a is less than b.");
            System.out.println("a is greater.");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
