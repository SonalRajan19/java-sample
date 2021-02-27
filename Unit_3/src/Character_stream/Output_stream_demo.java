/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author SONAL L R
 */
public class Output_stream_demo {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String str="java programming";
        bw.write(str);
    }
}