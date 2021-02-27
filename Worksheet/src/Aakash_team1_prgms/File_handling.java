/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class File_handling {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner object=new Scanner(System.in);
        System.out.println("Enter the file name:"); 
        String filename=object.next();
        File first=new File(filename);
        if(first.exists()) 
            System.out.println("yes the file exists");
        else {
            System.out.println("File doesn't exist");
            return;
        }
        System.out.println("file name:"+first.getName()); 
        System.out.println("file length:"+first.length()+" in bytes"); 
        System.out.println(" Readable boolean value:"+first.canRead());  
        System.out.println("Writable boolean value:"+first.canWrite()); 
    }
}