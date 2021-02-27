
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
public class Char_array_writer1 {
    public static void main(String[] args) throws IOException{
        String str="oops class";
        CharArrayWriter cw=new CharArrayWriter();
        cw.write(str,6,4);
        System.out.println(cw); //lass
        char c[]={'a','b','c'};
        cw.write(c,1,1);
        System.out.println(cw); //lass lassb
    }
}