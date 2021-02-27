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
public class Stack_trace_element1 {
    public static void main(String[] args){
        try
        {
            throw new ArithmeticException("/ by zero");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            StackTraceElement[] stackTrace=e.getStackTrace(); //returns some sets of lines
            for(StackTraceElement s : stackTrace)
            {
                System.out.println("at "+s.getClassName()+"."+s.getMethodName()+"("+s.getFileName()+":"+s.getLineNumber()+")");
            }
        }
    }
}
