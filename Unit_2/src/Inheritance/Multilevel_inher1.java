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
public class Multilevel_inher1 {
    public static void main(String[] args){
        result obj=new result();
        obj.calculate();
        obj.display();
    }
}
class student2
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
class mark1 extends student2
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
class result extends mark1
{
    double total,avg;
    public void calculate()
    {
        super.read();
        total=m1+m2+m3;
        avg=total/3;
    }
    public void display()
    {
        super.display();
        System.out.println("Student result");
        System.out.println("Total:"+total);
        System.out.println("Average:"+avg);
    }
}