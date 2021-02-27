/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class File_reader_demo1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fd=new FileReader("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\Character_stream\\char.txt");
        int read,count=1;
        while((read=fd.read())!=-1) //reads character by charcter
        {
            if((char)read=='\n')
                count++;
        }
        System.out.println("Number of sentences:"+count);
        fd.close();
    }
}