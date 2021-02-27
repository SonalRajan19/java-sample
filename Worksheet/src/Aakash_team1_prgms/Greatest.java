/*
Write a static method max3() that takes three int arguments and returns the value of the 
largest one. Add an overloaded method that does the same thing with three double values.
 */
package Aakash_team1_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Greatest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first int data type element:");
        int x=input.nextInt();
        System.out.println("Enter the second int data type element:");
        int y=input.nextInt();
        System.out.println("Enter the third int data type element:");
        int z=input.nextInt();
        max3(x,y,z);
        
        System.out.println("Enter the first double data type element:");
        double p=input.nextInt();
        System.out.println("Enter the second double data type element:");
        double q=input.nextInt();
        System.out.println("Enter the third double data type element:");
        double r=input.nextInt();
        max3(p,q,r);
    }
    public static void max3(int a,int b, int c)
    {     
        if(a>b && a>c)
        {
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is greatest");
        }   
        else
        {
            System.out.println(c+" is greatest");
        }
     }
    public static void max3(double a,double b, double c)
    {     
        if(a>b && a>c)
        {
            System.out.println(a+"is greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is greatest");
        }   
        else
        {
            System.out.println(c+" is greatest");
        }
    } 
}