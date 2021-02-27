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
public class Hierarchical_inher1 {
     public static void main(String[] args){
        //student3 s[]=new student3[10];
        student3 obj=new student3();
        obj.getstudentdetails();
        obj.show();
        /*for(int i=0;i<10;i++)
        {
            s[i]=new student2();
            s[i].getstudentdetails();
            s[i].show();
        }  
        staff1 in[]=new staff1[10];*/
        staff1 obj1=new staff1();
        obj1.getstaffdetails();
        obj1.show();
        /*for(int i=0;i<10;i++)
        {
            in[i]=new staff();
            in[i].getstaffdetails();
            in[i].show();
        }*/  
    }
}
class book
{
    String bookname;
    int accessno;
    String authorname;
    Scanner obj=new Scanner(System.in);
    public void getbookdetails()
    {
        System.out.println("Enter book name:");
        bookname=obj.next();
        System.out.println("Enter accesno:");
        accessno=obj.nextInt();
        System.out.println("Enter author name:");
        authorname=obj.next();
    }
    public void show()
    {
        System.out.println("Enter the book details:");
        System.out.println("Book name:"+bookname);
        System.out.println("Accessno:"+accessno);
        System.out.println("Author name:"+authorname);
    }
}
class student3 extends book
{
    String name;
    String rollno;
    String dept;
    public void getstudentdetails()
    {
        super.getbookdetails();
        System.out.println("Enter student name:");
        name=obj.next();
        System.out.println("Enter student rollno:");
        rollno=obj.next();
        System.out.println("Enter the department:");
        dept=obj.next();
    }
    public void show()
    {
        super.show();
        System.out.println("Student details:");
        System.out.println("Student name:"+name+"\nStudent rollno:"+rollno+"\nDepartment:"+dept);
    }
}
class staff1 extends book
{
    String sname;
    String srollno;
    String sdept;
    public void getstaffdetails()
    {
        super.getbookdetails();
        System.out.println("Enter staff name:");
        sname=obj.next();
        System.out.println("Enter staff rollno:");
        srollno=obj.next();
        System.out.println("Enter staff department:");
        sdept=obj.next();
    }
    public void show()
    {
        super.show();
        System.out.println("Staff details:");
        System.out.println("Staff name:\n"+sname+"Staff rollno:\n"+srollno+"Department:\n"+sdept);
    }
}