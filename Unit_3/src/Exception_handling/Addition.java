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
public class Addition {
    public static void main(String args[]){
        try
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            System.out.println(a+b); //10+20=30
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
