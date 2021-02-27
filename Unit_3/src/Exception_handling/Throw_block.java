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
public class Throw_block {
    public static void main(String[] args){
        /*//throw new ArithmeticException(" ");
          ArithmeticException a=new ArithmeticException("error");
          throw a;*/
        try
        {
            //throw new ArithmeticException(" ");
            ArithmeticException a=new ArithmeticException("error");
            throw a;
        }
        catch(ArithmeticException e) //handles error
        {
            System.out.println(e);
        }
    }
}