/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team4_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Student_info {
    public static void main(String[] args) {
        student arr[]=new student[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=new student();
            arr[i].getdata();
            arr[i].display();
        }
    }
}
class student
{
    int rollno;
    String name;
    static String college_name="Velammal";
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Roll no:");
        rollno=obj.nextInt();
        System.out.println("Enter the name of the student:");
        name=obj.next();
    }
    void display()
    {
        System.out.println("Details of the student are:");
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("College_Name:"+college_name);
    }
}