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
public class Stack_trace_element {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value:");
        try
        {
            int i=obj.nextInt();
            System.out.println("Enter the value:"+i);
        }
        catch(Exception a)
        {
            StackTraceElement[] stackTrace=a.getStackTrace(); //returns some sets of lines
            for(StackTraceElement s : stackTrace)
            {
                System.out.println("at"+s.getClassName()+"."+s.getMethodName()+"("+s.getFileName()+":"+s.getLineNumber()+")");
            }
        }
    }
}
//getStackTrace-method