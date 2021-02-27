/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.CharArrayWriter;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Char_array_writer {
    public static void main(String[] args) throws IOException{
        String str="oops class";
        CharArrayWriter cw=new CharArrayWriter();
        cw.write(str);
        System.out.println(cw); //oops class
        char c[]={'a','b','c'};
        cw.write(c);
        System.out.println(cw); //oops class oops classabc
    }
}