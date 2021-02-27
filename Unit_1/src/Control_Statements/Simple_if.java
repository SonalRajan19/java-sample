/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Statements;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Simple_if {
    public static void main(String[] args){
        int marks;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks=obj.nextInt();
        if(marks>=40)
        {
            System.out.println("You are pass.");
        }
    }
}
