/*
   The last control statement is return. The return statement is used to
    explicitly return from a method. 
   That is, it causes program control to transfer back to the caller of the
    method. 
   The return statement immediately terminates the method in which it is
    executed.
 */
package Control_Statements;

/**
 *
 * @author SONAL L R
 */
public class Return_jump {
    public static void main(String[] args){ 
        boolean t=true;
        System.out.println("Before the return."); 
        if(t) 
            return;       // return to caller 
        System.out.println("This won't execute."); 
    }
}