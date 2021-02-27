/*
   This statement is used only within looping statements.
   When the continue statement is encountered, the next iteration starts.
   The remaining statements in the loop are skipped. The execution starts from the
    top of loop again.

 */
package Control_Statements;

/**
 *
 * @author SONAL L R
 */
public class Continue_jump {
    public static void main(String args[])
    { 
        for(int i=1;i<1=0;i++) 
        { 
            if(i%2==0) 
                continue;
            System.out.println("\n"+i);
        }
    }
}