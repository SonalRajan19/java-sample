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
public class Minimum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A,B;
        System.out.println("Enter A value:");
        A=obj.nextInt();
        System.out.println("Enter B value:");
        B=obj.nextInt();
        if(A>B)
            System.out.println("Minimum number is:"+B);
        else if(B>A)
            System.out.println("Minimum number is:"+A);
        else
            System.out.println("Equal");
    }
}