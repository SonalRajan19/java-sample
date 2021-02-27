/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class File_writer_demo {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("char1.txt");
        String str="Object Oriented Programming";
        fw.write(str);
        fw.write(97);
        char c[]=str.toCharArray();
        fw.write(c);
        fw.close();
    }
}