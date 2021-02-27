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
public class Finally_block {
    public static void main(String[] args){
        try
        {
            int k=10,j=0;
            int i=k/j;
        }
        /*catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
        o/p:
            Finally block.
            Exception in thread "main" java.lang.ArithmeticException: / by zero
            at Exception_handling.Finally_block.main(Finally_block.java:17)
            C:\Users\lrsub\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1*/
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
        /*o/p:
            Exception:java.lang.ArithmeticException: / by zero 
            Finally block.*/
        
        finally
        {
            System.out.println("Finally block.");
        }
    }
}
