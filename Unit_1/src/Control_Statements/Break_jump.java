/*
   This statement is used to jump out of a loop. 
   Break statement was previously used in switch – case statements. 
   On encountering a break statement within a loop, the execution continues with the next statement outside the loop. 
   The remaining statements which are after the break and within the loop are skipped. 
   Break statement can also be used with the label of a statement. 
   A statement can be labeled as follows.
    statementName : SomeJavaStatement
   When we use break statement along with label as,
    break statementName;
 */
package Control_Statements;

/**
 *
 * @author SONAL L R
 */
public class Break_jump {
    public static void main(String[] args){
        int i=1; 
        while(i<=10) 
        { 
            System.out.println("\n"+i); 
            i++; 
            if(i==5) 
            { 
                break; 
            } 
        }
    }
}