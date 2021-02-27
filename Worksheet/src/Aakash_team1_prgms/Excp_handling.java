/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Excp_handling {
     public static void main(String[] args) {
        // entering the digits and creating arithmeticexception
        Scanner obj=new Scanner(System.in);
        try
        {
            int a=10;
            int b=0;
            int c=a/b;
        }
        catch(ArithmeticException s)
        {
            System.out.println(s+"\n");
        }
        // trying to convert string to integer
        try
        {
            System.out.println("Enter the Integer:");
            int ans=Integer.parseInt(obj.next());
        }
        catch(NumberFormatException s)
        {
            System.out.println(s+"\n");
        }
        // creating array and accesing an element out of bounds
        try
        {
            int ans1[]=new int[3];
            ans1[6]=19;
        }
        catch(ArrayIndexOutOfBoundsException s)
        {
            System.out.println(s+"\n");
        }
        try
        {
            String str1="Aakash Chandha";
            str1.charAt(40);
        }
        catch(StringIndexOutOfBoundsException s)
        {
            System.out.println(s);
        }
    }
}