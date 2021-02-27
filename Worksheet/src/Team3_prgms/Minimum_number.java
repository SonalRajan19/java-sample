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
public class Minimum_number {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 numbers:");
        a=obj.nextInt();
        b=obj.nextInt();
        int c=a<b?a:b;
        System.out.println("Minimum number is:"+c);
    }
}
