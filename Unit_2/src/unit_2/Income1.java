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
public class Income1 {
     public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        String name=obj.next();
        System.out.println("Enter the gender of the employee:");
        System.out.println("Enter 'M' for Male and 'F' for Female:");
        String gender=obj.next();
        System.out.println("Enter the income of the employee:");
        double income=obj.nextDouble();

        employee2 e=new employee2();
        e.information(gender,income);
        e.show();  
    } 
}
interface customer1
{
    void information(String g,double s);
    void show();
}
class employee2 implements customer1
{
    String gender;
    double income;
    public void information(String g,double i)
    {
        gender=g;
        income=i;   
    }
    public void show()
    {
        System.out.println("Gender of the employee:"+gender);
        System.out.println("Income of the employee:"+income);

        if(gender=="M")
        {
            if(income<=190000)
                System.out.println("Tax percentage is:NIL");
            else if(income>190000 && income<=200000)
                System.out.println("Tax percentage is:10%");
            else if(income>200000 && income<=500000)
                System.out.println("Tax percentage is:20%");
            else//if salary>500000
                System.out.println("Tax percentage is:25%");
        }            
        else//if(gender=="F")
        {
           if(income<=190000)
                System.out.println("Tax percentage is:NIL");
            else if(income>190000 && income<=200000)
                System.out.println("Tax percentage is:NIL");
            else if(income>200000 && income<=500000)
                System.out.println("Tax percentage is:10%");
            else//if salary>500000
                System.out.println("Tax percentage is:20%"); 
        } 
    }
}