/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Copy_file {
    public static void main(String[] args){
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\copy.txt");
            FileOutputStream fos=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\copy1.txt");  
            int read;
            while((read=fis.read())!=-1)
            {
                fos.write(read);
            }
            fis.close();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}