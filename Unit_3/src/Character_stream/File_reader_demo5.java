/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class File_reader_demo5 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        //to find the single length word
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\Character_stream\\char.txt"));
        String read;
        int i,count=0;
        String str[];
        while((read=br.readLine())!=null)
        {
            System.out.println("Line:"+read);
            str=read.split(" ");
            System.out.println("Number of words:"+str.length);
            for(i=0;i<str.length;i++)
            {
                System.out.println(str[i]);
                if(str[i].length()==1)
                    count++;
            }
        }
        System.out.println("One letter word is:"+count);
        br.close();
    }
}