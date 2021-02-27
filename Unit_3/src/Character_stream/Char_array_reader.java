/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Char_array_reader {
    public static void main(String[] args) throws IOException{
        String str="java programming";
        char c[]=str.toCharArray();
        CharArrayReader ca=new CharArrayReader(c);
        int read;
        char c1[]=new char[8];
        
        //from object ca,contents moves to c1 array
        ca.read(c1); //prints 8 characters including space
        for(char r:c1)
            System.out.print(r); //java pro
        /*while((read=ca.read())!=-1)
            System.out.print((char)read);*/
    }
}