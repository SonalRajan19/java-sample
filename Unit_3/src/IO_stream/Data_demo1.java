/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Data_demo1 {
    public static void main(String[] args){
        try
        {
            DataInputStream ds=new DataInputStream(System.in); //to get any primitive data
            System.out.println("Enter a number:");
            int i=Integer.parseInt(ds.readLine());
            System.out.println(i);
            ds.close();
            
            DataOutputStream ds1=new DataOutputStream(System.out);
            //System.out.println(ds1.toString());
            ds1.write(96);
            String str="oops";
            byte b[]=new byte[4];
            ds1.write(b);
            ds1.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
