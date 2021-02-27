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
public class Swap {
    public static void main(String[] args){
        String str="Have a nice day";
        String str1="Welcome to oops class";
        str=str+str1;
        //System.out.println(str);
        System.out.println(str.length());
        System.out.println(str1.length());
        str1=str.substring(0,str.length()-str1.length());
        System.out.println(str1.length());
        str=str.substring(str1.length());
        System.out.println("After Swapping:\n"+str+"\n"+str1);
    }
}
