/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_handling;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader;

/**
 *
 * @author SONAL L R
 */
public class File_demo {
    public static void main(String args[])  { 
        try 
        { 
            // Following file does not exist 
            File file=new File("file.txt"); 
            FileReader fr=new FileReader(file); 
        }
        catch(FileNotFoundException e) 
        { 
           System.out.println("File does not exist"); 
        } 
    } 
}