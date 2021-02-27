/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team2_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Sum_product {
    public static void main(String[] args) {
       int number,n,sum=0,product=1;
       Scanner b=new Scanner(System.in);
       System.out.println("Enter a number:");
       number=b.nextInt();
       while(number>0)
       {
           n=number%10;
           sum=sum+n;
           product=product*n;
           number=number/10;
       }
       System.out.println("sum of digits:"+sum);
       System.out.println("product of digits:"+product);
    }
}
