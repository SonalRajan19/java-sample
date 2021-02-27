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
public class Switch {
    public static void main(String[] args){
         int days;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any day:");
        days=obj.nextInt();
        switch(days)
        {
            case 1:
                System.out.println("Sunday:\n");
                break;
            case 2:
                System.out.println("Monday:\n");
                break;
            case 3:
                System.out.println("Tuesday:\n");
                break;
            case 4:
                System.out.println("wednesday:\n");
                break;
            case 5:
                System.out.println("Thursday:\n");
                break;    
            case 6:
                System.out.println("Friday:\n");
                break;    
            case 7:
                System.out.println("Saturday:\n");
                break;    
            default:
                System.out.println("Wrong output");
        }
    }
}