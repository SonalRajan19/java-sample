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
public class Nested_try {
    public static void main(String[] args){
        try
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            try
            {
                System.out.println(a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            /*try
            {
                int c[]=new int[-10];
            }
            catch(NegativeArraySizeException e)
            {
                System.out.println(e);
            }*/
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}