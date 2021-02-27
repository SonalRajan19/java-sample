/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author SONAL L R
 */
public class BinaryStream_demo {
    public static void main(String[] args)
    {
        try
        {
            FileReader fio=null;
            FileWriter fou=null;
            fio=new FileReader("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\dhoni.jpg");
            fou=new FileWriter("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\dhoni1.jpg");
            int i;
            while((i=fio.read())!= -1)
                fou.write(i);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        /*
        FileInputStream fio=null;
        FileOutputStream fou=null;
        //FileReader fio1=null;
        //FileWriter fou1=null;
        fio=new FileInputStream("input.jpg");
        fou=new FileOutputStream("output.jpg");
        //fio1=new FileReader("input.jpg");
        //fou1=new FileWriter("output.jpg");
        int i;
        while((i=fio.read())!=-1)
            fou.write(1);
        */
    }
}