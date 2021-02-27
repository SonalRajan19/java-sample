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
public class String_buffer {
    public static void main(String[] args){
        StringBuffer s=new StringBuffer("oops class.");
        System.out.println(s.length());
        System.out.println(s.capacity());
        
        s.ensureCapacity(100);
        System.out.println(s.capacity());
        
        s.setLength(3);
        System.out.println(s);
        System.out.println(s.charAt(1));
        
        s.setCharAt(0,'c');
        System.out.println(s);
        
        //append:
        s=s.append("sin(").append(90).append(")");
        System.out.println(s);
        
        //insert:
        s=s.insert(3,"java"); //java is added between char p and sin90
        System.out.println(s);
        //System.out.println(s.reverse()); //the whole string is reversed
        
        //delete:
        s.delete(5,8); //from 5-7 characters are deleted
        System.out.println(s);
        System.out.println(s.deleteCharAt(0)); //particular character is deleted
    }
}
