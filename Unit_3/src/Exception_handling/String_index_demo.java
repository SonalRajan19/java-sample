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
public class String_index_demo {
    public static void main(String[] args)
    {
        // TODO code application logic here
        String s="welcome to oops class";
        try
        {
        System.out.println(s.substring(5,50));
        }
        catch(Exception a)
        {
            System.out.println(a);
        }
    }
}
