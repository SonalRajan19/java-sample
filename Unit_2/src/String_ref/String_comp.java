/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_ref;

/**
 *
 * @author SONAL L R
 */
public class String_comp {
    public static void main(String[] args){
        
        //String comparison
        String s="OOPS";
        String s1="oops";
        if(s.equals(s1))
            System.out.println("Equal.");
        else
            System.out.println("Not euqal.");
        
        //To check only if the content is same:
        String s2="oops";
        String s3="OOPS";
        if(s2.equalsIgnoreCase(s3))
            System.out.println("Equal.");
        else
            System.out.println("Not equal.");
        
        //compareTo (return typr-integer,+ve/-ve value)
        String s4="abc";
        String s5="def";
        if(s4.compareTo(s5)>0)
            System.out.println("Greater");
        else
            System.out.println("Lesser");
    }
}