/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author SONAL L R
 */
public class Read_file {
    public static void main(String args[]){
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\first.txt");
            System.out.println((char)fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}