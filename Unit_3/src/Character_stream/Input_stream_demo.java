/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author SONAL L R
 */
public class Input_stream_demo {
    public static void main(String[] args) throws IOException{
        BufferedReader bs=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name and rollno:");
        String name=bs.readLine();
        int rollno=Integer.parseInt(bs.readLine());
        //float f=Float.parseFloat(bs.readLine());
        System.out.println(name+" "+rollno);
    }
}