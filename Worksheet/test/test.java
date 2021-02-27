
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sonal L R
 */
public class test {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\lrsub\\OneDrive\\Documents\\NetBeansProjects\\Worksheet\\src\\nptel.txt");
        System.out.println("Length:"+f.length());
    }
}