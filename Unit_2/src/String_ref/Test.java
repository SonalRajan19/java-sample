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
public class Test {
    public static void main(String[] args){
        String s=new String("OOPS");
        String s1=new String("OOPS");
        System.out.println(s1);
        if(s==s1)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
