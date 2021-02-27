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
public class Rethrow_demo {
    public static void main(String[] args) {
        // TODO code application logic here
        sample obj=new sample();
        try
        {
            obj.add();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Rethrown Exception:"+e);
        }
    }
}
class sample
{
    
}