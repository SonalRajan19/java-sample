/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Single_inher2 {
    public static void main(String[] args){
        mark obj=new mark();
        obj.read();
        obj.display();
    }
}
class student1
{
    String name;
    String rollno;
    Scanner obj=new Scanner(System.in);
    public void read()
    {
        System.out.println("Enter the student name:");
        name=obj.next();
        System.out.println("Enter the student rollno:");
        rollno=obj.next();
    }
    public void display()
    {
        System.out.println("Students details:");
        System.out.println("Student name:"+name);
        System.out.println("Student rollno:"+rollno);
    }
}
class mark extends student1
{
    double m1,m2,m3;
    public void read()
    {
        super.read();
        System.out.println("Enter mark1:");
        m1=obj.nextDouble();
        System.out.println("Enter mark2:");
        m2=obj.nextDouble();
        System.out.println("Enter mark3:");
        m3=obj.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("Student mark details:");
        System.out.println("Mark1:"+m1+"Mark2:"+m2+"Mark3:"+m3);
    }
}