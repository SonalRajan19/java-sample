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
public class Demo7 {
    public static void main(String[] args){
        int i=10;
        int j=0;
        int a[]=new int[3];
        Scanner obj=new Scanner(System.in);
        String s=null;
        try //try block
        {
            int k=i/j;
            k=Integer.parseInt(obj.next());
            System.out.println(k);
            a[3]=10;
            s.substring(2);
        }   
        catch(ArrayIndexOutOfBoundsException e) //catch block to handle error
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
