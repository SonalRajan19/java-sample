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
public class Throw_block1 {
    public static void main(String[] args){
        try
        {
            int a=10,b=20;
            if(a<b)
                throw new ArithmeticException("a is lesser than b.");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
