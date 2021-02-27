/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
/**
 *
 * @author SONAL L R
 */
public class Piped_io_demo {
    public static void main(String[] args) throws IOException{
        PipedInputStream in=new PipedInputStream();
        PipedOutputStream out=new PipedOutputStream();
        in.connect(out);
        out.write(97);
        //System.out.println((char)in.read()); //a
        System.out.println(in.read()); //97
    }
}