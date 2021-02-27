/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Sonal L R
 */
public class Binary {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    //ByteStream
        FileInputStream inputs=null;
        FileOutputStream outputs=null;
        inputs=new FileInputStream("C:\\Users\\ashok kavitha\\Documents\\NetBeansProjects\\java10\\IMG-20200824-WA0057.jpg");
        outputs =new FileOutputStream("C:\\Users\\ashok kavitha\\Documents\\NetBeansProjects\\java10\\IMG-20200824-WA0058");
        int read;
        while((read= inputs.read())!=-1) 
            outputs.write(read); 
        inputs.close();
        outputs.close();
        
        //CharacterStream
        FileReader reading=null;
        FileWriter writing=null;
        reading=new FileReader("C:\\Users\\ashok kavitha\\Documents\\NetBeansProjects\\java10\\IMG-20200824-WA0057.jpg");
        writing=new FileWriter("C:\\Users\\ashok kavitha\\Documents\\NetBeansProjects\\java10\\IMG-20200824-WA0058.jpg");
        int i;
        while((i=reading.read())!=-1) 
            writing.write(i); 
        reading.close();
        writing.close();
    }
}