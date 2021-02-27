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
public class Demo2 {
    public static void main(String[] args){
        int i=10;
        int j=0;
        try //try block
        {
            int k=i/j;
            System.out.println(k);
        }   
        catch(ArithmeticException s)
        {
            System.out.println(s.getMessage());
        }
    }
}
