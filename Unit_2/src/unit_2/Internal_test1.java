/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_2;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Internal_test1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Employee m=new Manager();
        Employee c=new Clerk();
        System.out.println("ENTER MANAGER DETAILS:");
        m.getdetails();
        System.out.println("MANAGER DETAILS:");
        System.out.println(m);
        System.out.println("Salary is:Rs."+m.Salary());
        System.out.println("\nENTER CLERK DETAILS:");
        c.getdetails();
        System.out.println("CLERK DETAILS:");
        System.out.println(c);
        System.out.println("Salary is:Rs."+c.Salary());
    } 
}
abstract class Employee //abstract class
{
    Scanner s=new Scanner(System.in);
    String name;
    int age;
    float hourrate; 
    void getdetails()
    {
        System.out.println("Enter employee name:");
        name=s.next();
        System.out.println("Enter employee age:");
        age=s.nextInt();
        System.out.println("Enter the no.of hours worked:");
        hourrate=s.nextFloat();
    }
    abstract double Salary();
    public String toString()
    {
        return "Name:"+name+"\nAge:"+age+"\nHours worked:"+hourrate;
    }
}
class Manager extends Employee  //derived class
{
    float manager_salary;
    double Salary()
    {
        manager_salary=hourrate*1000;  //for 1 hour=Rs.1000
        return manager_salary;
    }
}
class Clerk extends Employee    //derived class
{
    float clerk_salary;
    double Salary()
    {
        clerk_salary=hourrate*300;     //for 1 hour=Rs.300 
        return clerk_salary;
    }
}