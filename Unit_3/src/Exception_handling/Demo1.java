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
public class Demo1 {
    public static void main(String[] args){
        int i=10;
        int j=0;
        try
        {
            int k=i/j;
            System.out.println(k);
        }   
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
