/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Byte_array_demo1 {
    public static void main(String[] args){
        try
        {
            ByteArrayOutputStream ba=new ByteArrayOutputStream();
            String str="The complete reference in tha java programming.";
            byte b[]=str.getBytes();
            ba.write(b);
            System.out.println(ba);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}