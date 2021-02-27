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
public class Greeting {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        double maths,english,science,social,tamil,total;
        System.out.println("Enter the marks subject wise:");
        System.out.println("Enter maths mark:");
        maths=obj.nextDouble();
        System.out.println("Enter english mark:");
        english=obj.nextDouble();
        System.out.println("Enter science mark:");
        science=obj.nextDouble();
        System.out.println("Enter social mark:");
        social=obj.nextDouble();
        System.out.println("Enter tamil mark:");
        tamil=obj.nextDouble();
        total=maths+english+science+social+tamil;
        System.out.println("totally you scored="+ total);
        if(total>450)
        {
            System.out.println("Congrats it is a distinction");
        }
        else if(total>400)
        {
            System.out.println("Congrats you scored a great mark");
        }
        else if(total>300)
        {
            System.out.println("It is a good mark");
        }
        else
        {
            System.out.println("Try hard next time");
        }                   
    }    
}