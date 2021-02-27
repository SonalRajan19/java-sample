/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.PrintStream;

/**
 *
 * @author SONAL L R
 */
public class Print_demo1 {
    public static void main(String args[]){
        PrintStream ps=new PrintStream(System.out);
        ps.print(87);
        ps.print("\n");
        ps.print('L');
        ps.print("\t");
        ps.print('R');
        ps.print("\n"); 
        ps.print("Sonal");
        ps.print("\n"); 
        ps.close();
    }
}
