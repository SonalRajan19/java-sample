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
public class File_reader_demo2 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\Character_stream\\char.txt"));
        String read;
        while((read=br.readLine())!=null)
            System.out.println(read); //returns in String
        br.close();
    }
}