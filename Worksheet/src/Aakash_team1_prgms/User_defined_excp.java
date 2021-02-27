/*
Write a java program for exception handling:
To create a user defined exception whenever user input the word “hello”.
To add two integers and raise exception when any other character except number (0 – 9) is given as input.

 */
package Aakash_team1_prgms;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class User_defined_excp {
    public static void main(String args[]){
        UserDefinedException_Hello obj=new UserDefinedException_Hello();
        try{
            obj.hellofilter();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    void hellofilter() throws exceptionhello{
        Scanner input = new Scanner(System.in);
        System.out.print("Input with a string: ");
        String compare = input.next();
        if("hello".equals(compare)){
            throw new exceptionhello("not accepted");
        }
        else{
            System.out.println("input accepted");
        }
    }
}
class exceptionhello extends Exception{
    exceptionhello(String msg){
        super(msg);
    }
}