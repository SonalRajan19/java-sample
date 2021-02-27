/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;
import java.io.IOException;
import java.io.FileInputStream;
/**
 *
 * @author SONAL L R
 */
public class Read_file1 {
    public static void main(String[] args){
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\first.txt");
            int c;
            while((c=fis.read())!=-1)
                System.out.print((char)c);
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}