/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_1;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Demo {
    public static void main(String[] args) {
        int a=10,b=3;
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);


        switch(c)
        {
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            default:
                System.out.println("Incorrect option");
        }
        String opt=obj.next();
        switch(opt)
        {
            case "add": System.out.println(a+b);
            break;
        }

    }
}
