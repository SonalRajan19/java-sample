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
public class Income2 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the employee name:");
        String name=obj.next();
        System.out.print("Enter the gender of the employee(Enter F for female and M for male):");
        String gender=obj.next();
        System.out.print("Enter the income of the employee:");
        double income=obj.nextDouble();
        double tax=0;
        employee3 e=new employee3();
        e.show(income,gender,tax);
   }
}
interface Customer2
{
    void information();
    void show(double i,String g,double t);  
} 
class employee3 implements Customer2
{     
    String gender;
    double income;
    double tax;
    public void information()
    {
        System.out.print("The tax amount differs from gender to gender.");
        System.out.println("The tax amount differs from the salary of the employee also.");
    }
    public void show(double i,String g,double t)
    {
        System.out.println("\nCALCULATION OF TAX:");
        if(income<=190000)
        {
            tax=income*0.0;
            System.out.println("The tax is 0% from the salary");
            System.out.println("The tax of the employee is:"+tax);
        }
        if(income>190000 && income<=200000)
        {
            if(gender=="M")
            {
                tax=income*0.1;
                System.out.println("The tax is 10% from the salary");
                System.out.println("The tax of the employee is:"+tax);
            }
            if(gender=="F")
            {
                tax=income*0.0;
                System.out.println("The tax is 0% from the salary");
                System.out.println("The tax of the employee is:"+tax);
            }
        }
        if(income>200000 && income<=500000)
        {
            if(gender=="M")
            {
                tax=income*0.2;
                System.out.println("The tax is 20% from the salary");
                System.out.println("The tax of the employee is:"+tax);
            }
            if(gender=="F")
            {
                tax=income*0.1;
                System.out.println("The tax is 10% from the salary");
                System.out.println("The tax of the employee is:"+tax);
            }
        }
        else //if(income>500000)
        {
            if(gender=="M")
            {
                tax=income*0.25;
                System.out.println("The tax is 25% from the salary");
                System.out.println("The tax of the employee is:"+tax);
            }
            if(gender=="F")
            {
                tax=income*0.2;
                System.out.println("The tax is 20% from the salary");
                System.out.println("The tax of the employee is:"+tax);
            }           
        }
    }
}
