/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team3_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Palindrome {
    public static void main(String args[])
    {
        int r,sum=0,temp;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}
