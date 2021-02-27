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
public class Creation {
    public static void main(String[] args){
        String s=new String();
        s="OOPS";
        String s1=new String("JAVA");
        char c[]={'o','o','p','s'};  //0 1 2 3
        String s2=new String(c,2,2); //char array, begin index, no.of chars
        System.out.println(s2);
        byte b[]={65,66,67,68};
        String s3=new String(b,0,2); //byte array, begin index, no.of bytes
        System.out.println(s3);
        String s4=new String(s);
        
        //String Concatenation
        System.out.println(s2+s3);
        System.out.println("Add:"+(1+2));
        
        //String extraction
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        
        //Reverse string oops=>spoo
        for(int i=s.length()-1;i>=0;i++)
        System.out.println(s.charAt(i));
        //getchars(start,end,char[].targetindex)
        String s5="Welcome to OOPS class";
        //char c1[]=new char[10];
        char c1[]={'j','1','1','p','j','u','h'};
        
        s5.getChars(0,2,c1,4);
        for(char i:c1)
        System.out.println(i);
        
        /*byte b1[]=new byte[10];
        b1=s5.getBytes();
        for(byte i:b1)
        System.out.println((char)i);*/
        
        char c2[]=new char[20];
        c2=s5.toCharArray();
        for(char i:c2)
        System.out.println(i);
    }
}