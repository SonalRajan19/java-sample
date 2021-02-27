/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.Console;

/**
 *
 * @author Sonal L R
 */
public class Console_demo {
    public static void main(String[] args){
        Console console=System.console();
        if(console==null)
        {
            System.out.println("Console is not supported.");
            System.exit(1);
        }
        String name=console.readLine("What's your name?");
        String age=console.readLine("How old ar you?");
        String city=console.readLine("Where do you live?");
        console.format("Hi,a six year old man is living in %s",name,age,city);
    }
}
