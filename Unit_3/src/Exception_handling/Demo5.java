/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_handling;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Demo5 {
    public static void main(String[] args){
        int i=10;
        int j=2;
        int a[]=new int[3];
        Scanner obj=new Scanner(System.in);
        try //try block
        {
            int k=i/j;
            k=Integer.parseInt(obj.next());
            System.out.println(k);
            a[3]=10;
        }   
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}