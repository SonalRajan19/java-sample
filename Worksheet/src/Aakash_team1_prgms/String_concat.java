/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class String_concat {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String a=obj.nextLine();
        String b="My name is ";
        String c=b.concat(a);
        System.out.println(c);
    }
}   