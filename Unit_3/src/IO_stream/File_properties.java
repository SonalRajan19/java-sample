/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.File;

/**
 *
 * @author SONAL L R
 */
public class File_properties {
    public static void main(String[] args){
        File f=new File("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream");
        System.out.println("Name:"+f.getName()); //Name:program.java
        System.out.println("File path:"+f.getParent()); //File path:C:\Users\lrsub\Documents\NetBeansProjects\Unit_3\src\IO_stream
        System.out.println("File path:"+f.getPath()); //File path:C:\Users\lrsub\Documents\NetBeansProjects\Unit_3\src\IO_stream\program.java
        System.out.println(f.exists()); //true
        System.out.println(f.isFile()); //false
        System.out.println(f.isDirectory()); //true
        String name[]=f.list();
        System.out.println("Number of files: "+name.length); //35
        for(String fname : name)
            System.out.println(fname);
        //checks the length of the file
        System.out.println(f.length()); //12288
        f.setExecutable(false); //true
        System.out.println(f.canExecute()); //true
        f.setReadable(false); //true
        System.out.println(f.canRead()); //true
        f.setWritable(true); //false
        System.out.println(f.canWrite()); //true
    }
}
