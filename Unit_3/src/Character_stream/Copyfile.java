/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Copyfile {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr=new FileReader("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\Character_stream\\char.txt");
        FileWriter fw=new FileWriter("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\Character_stream\\char1.txt");
        int read;
        while((read=fr.read())!=-1)
            fw.write(read);
        fr.close();
        fw.close();
    }
}