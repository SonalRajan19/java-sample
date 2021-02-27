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
public class Index_of {
    public static void main(String[] args){
        
        //indexOf:(returns index value)
        String s="oops class oops jjj";
        System.out.println(s.indexOf("oops"));
        System.out.println(s.indexOf("oops",10));
        System.out.println(s.indexOf('s'));
        System.out.println(s.indexOf('s',10));
        
        //last indexOf:(returns index value)
        System.out.println(s.lastIndexOf("oops"));
        System.out.println(s.lastIndexOf("oops",10));
        System.out.println(s.lastIndexOf('s'));
        System.out.println(s.lastIndexOf('s',5));
        
        //Modifying:
        System.out.println(s.substring(10));
        System.out.println(s.substring(10,14));
    }
}
