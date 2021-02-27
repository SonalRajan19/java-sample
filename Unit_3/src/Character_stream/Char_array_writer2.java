/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Char_array_writer2 {
    public static void main(String[] args) throws IOException {
        
        //to write inside a file
        String str="oops class";
        CharArrayWriter cw=new CharArrayWriter();
        FileWriter fw=new FileWriter("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\Character_stream\\one.txt");
        cw.write(str,6,4);
        System.out.println(cw); //lass
        char c[]={'a','b','c'};
        cw.write(c,1,1);
        System.out.println(cw); //lass lassb
        fw.flush(); //clears the stream
    }
}