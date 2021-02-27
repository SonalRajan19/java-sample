/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;
import java.io.ByteArrayInputStream;

/**
 *
 * @author SONAL L R
 */
public class Byte_array_demo {
    public static void main(String[] args){
        String str="oops class";
        byte b[]=str.getBytes();
        try
        {
            ByteArrayInputStream bs=new ByteArrayInputStream(b);
            int read;
            while((read=bs.read())!=-1) //reads one byte at a time
            {
                System.out.print((char)read);
            }
            System.out.println();
            bs.reset(); //going to my first position
            byte b1[]=new byte[10];
            bs.read(b1,1,6);
            for(byte b2:b1)
                System.out.println((char)b2);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
//b1->byte array
//5->from where to store
//3->length