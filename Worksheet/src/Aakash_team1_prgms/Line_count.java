/*
Write a Java program ‘LineCounts.java’ that will count the number of lines in each
files that is specified on the command line. Note that multiple files can be specified, 
as in 	"javaLineCounts file1.txt file2.txt file3.txt".
 */
package Aakash_team1_prgms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sonal L R
 */
public class Line_count {
    public static void main(String[] args) throws FileNotFoundException {
        for (String arg : args) {
            System.out.print(arg + ":  ");
            countLines(arg);
        }
    } 
    private static void countLines(String fileName) throws FileNotFoundException {
        BufferedReader in;  // A stream for reading from the file.
        File f;
        String line;
        int lineCount;      // Number of lines in the file.
        in = new BufferedReader(new FileReader(fileName) );
        lineCount = 0;
        try { 
        while ((line=in.readLine())!= null) {
            lineCount++;     
            line = in.readLine();     
        }
        }
        catch (IOException e) {
            System.out.println("Error.   Problem with reading from file.");
        return;
        }
        System.out.println(lineCount + " lines");    
    } 
}