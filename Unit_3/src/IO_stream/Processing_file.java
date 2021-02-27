/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Processing_file {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fs=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\Intro.txt");
        int read,count=0;
        while((read=fs.read())!=-1)
        {
            //if((char)read=='.') Number of lines:3
            //if((char)read==10) Number of lines:2
            //if((char)read=='a') Number of letter a is:4
            //if((char)read=='a'||(char)read=='e'||(char)read=='i'||(char)read=='o'||(char)read=='u') Number of vowels is:21
                count++;
        }
        //System.out.println("Number of lines:"+count);
        //System.out.println("Number of letter a is:"+count);
        System.out.println("Number of vowels is:"+count);
        fs.close();
    }
}