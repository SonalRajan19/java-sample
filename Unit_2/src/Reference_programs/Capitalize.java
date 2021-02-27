/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reference_programs;

/**
 *
 * @author SONAL L R
 */
public class Capitalize {
    public static void main(String[] args){
        String str="have a nice day";
        String s[]=str.split(" ");
        System.out.println(s.length);
        String upper="";
        for(String i:s)
        {
            System.out.println(i); //have
            upper+= Character.toUpperCase(i.charAt(0))+i.substring(1)+" ";
        }
        System.out.println(upper);
    }
}