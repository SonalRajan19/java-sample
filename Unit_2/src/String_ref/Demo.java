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
public class Demo {
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
        
        //Replace:
        String s6="oops class oops jjj";
        System.out.println(s6.replace('o','r'));
        
        //Concatenate:
        System.out.println(s6.concat(" "+s5));
        
        //Trim: (eliminates spaces)
        String s7="\n\tOops World";
        System.out.println(s7.trim());
        
        //toUpperCase:
        System.out.println(s6.toUpperCase());
    }
}
