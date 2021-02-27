/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Internal_1 {
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        studetails s[]=new studetails[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Student "+(i+1)+" Details:");
            String rollno=s1.next();
            String name=s1.next();
            int age=s1.nextInt();
            float weight=s1.nextFloat();
            float height=s1.nextFloat();
            float mark=s1.nextFloat();
            s[i]=new studetails(rollno,name,age,weight,height,mark);
        }
        System.out.println("Students having age 19 and weight above 90:");
        for(int i=0;i<5;i++)
        {
            if(s[i].age==19 && s[i].weight>90)
            {
                System.out.println("Name:"+s[i].name+"\tRollno:"+s[i].rollno);
            }
        }
    }
}
class studetails
{
    String rollno,name;
    int age;
    float weight,height,mark;
    studetails(String r,String n,int a,float f,float f1,float f2)
    {
        rollno=r;
        name=n;
        age=a;
        weight=f;
        height=f1;
        mark=f2;
    }
}