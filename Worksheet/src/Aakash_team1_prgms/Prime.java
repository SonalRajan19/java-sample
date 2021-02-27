/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Prime {
    public static void main(String args[]){     
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number:");
    int a=obj.nextInt();
    int f=0;
    for(int i=2;i<=a/2;++i)
        {
            // condition for nonprime number
            if(a%i==0)
            {
                f=1;
                break;
            }
        }
    if(f==0)
    {
        System.out.println("It is a prime number.");
    }
    else
    {
         System.out.println("It is not a prime number.");
    }
}
}