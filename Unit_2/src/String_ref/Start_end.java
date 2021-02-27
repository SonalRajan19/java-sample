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
public class Start_end {
    public static void main(String[] args){
        
        //startsWith (returns true/false)
        String s="oops class jjj";
        String s1="oops class jjj";
        System.out.println(s.startsWith("oops"));
        System.out.println(s.startsWith("class",5));
        
        //endsWith (returns true/fale)
        System.out.println(s.endsWith("jjj"));
        System.out.println(s.endsWith("jjjkln"));
    }
}
