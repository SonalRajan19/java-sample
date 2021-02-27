/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author SONAL L R
 */
public class Income {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the employee name:\n");
        String a;
        char b;
        double salary,tax=0;
        int lary;
        a=input.next();
        System.out.print("\nEnter the employee gender(If female enter F and if male enter M):\n");
        b=input.next().charAt(0);
        System.out.print("\nEnter the employee salary:\n");
        salary=input.nextDouble();
        employee2 m=new employee2();
        m.show(salary,tax,b);
        m.information();
   }
}
interface Customer
{
    void information();
    void show(double income,double Tax,char b);
} 
class employee2 implements Customer
{
    public void show(double income,double Tax,char b)
    {
        System.out.println("\nCALCULATION OF TAX:");
        if(income<=190000)
        {
            if(b=='M')
            {
                Tax=income*0.0;
                System.out.println("The tax is 0% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }
            if(b=='F')
            {
                Tax=income*0.0;
                System.out.println("The tax is 0% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }
        }
        if(income>190000 && income<=200000)
        {
            if(b=='M')
            {
                Tax=income*0.1;
                System.out.println("The tax is 10% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }
            else
            {
                Tax=income*0.0;
                System.out.println("The tax is 0% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }
        }
        if(income>200000 && income<=500000)
        {
            if(b=='M')
            {
                Tax=income*0.2;
                System.out.println("The tax is 20% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }
            if(b=='F')
            {
                Tax=income*0.1;
                System.out.println("The tax is 10% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }
        }
        if(income>500000)
        {
            if(b=='M')
            {
                Tax=income*0.25;
                System.out.println("The tax is 25% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }
            else
            {
                Tax=income*0.2;
                System.out.println("The tax is 20% from the salary");
                System.out.println("The tax of the employee is:"+Tax);
            }                    
        }
    }
    //To change body of generated methods, choose Tools | Templates.
    public void information() 
    {
        System.out.print("\nThe tax amount differs from gender to gender.");
        System.out.println("The tax amount differs from the salary of the employee also.");
        System.out.println("If salary > = 5 lakh, then however high the salary is, after 5 lakh the tax percent is same. But it differs from gender.");
        System.out.println("If the salary < 1.9 lakh, then the tax is 0% for both the genders.");
        System.out.println("The tax starts differing more from 1.9 lakhs to 5 lakh.");
    }
}
