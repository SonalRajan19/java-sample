/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reference_programs;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Validation {
    public static void main(String[] args){
        //email=sonalrajan1971@gmail.com
        //phone=9344999002
        String email,phone;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter email id and phone number:");
        email=obj.next();
        phone=obj.next();
        if(email.contains("@") && email.contains("."))
            System.out.println("Valid email id.");
        else 
            System.out.println("Invalid email id.");
        if(phone.length()==10)
            System.out.println("Valid phone number.");
        else
            System.out.println("Invalid phone number.");
    }
}
