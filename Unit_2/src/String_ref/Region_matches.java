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
public class Region_matches {
    public static void main(String[] args){
        
        //region matches (returns true/false)
        String s="oops";
        System.out.println(s.regionMatches(0,"oops",0,4));
        System.out.println(s.regionMatches(2,"oops",0,4));
        
        String s1="oops class oops";
        System.out.println(s1.regionMatches(11,"oops",0,4));
        System.out.println(s1.regionMatches(5,"oops world",0,4));
        System.out.println(s1.regionMatches(0,s1,0,4));
    }
}
