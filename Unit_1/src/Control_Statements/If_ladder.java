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
public class If_ladder {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in); 
        System.out.println("Enter number between 0 to 6:"); 
        int day=obj.nextInt(); 
        if(day==0) 
        { 
            System.out.println("\nSunday"); 
        } 
        else if(day==1) 
        { 
            System.out.println("\nMonday"); 
        } 
        else if(day==2) 
        { 
            System.out.println("\nTuesday"); 
        }
        else if(day==3) 
        { 
            System.out.println("\nWednesday"); 
        } 
        else if(day==4) 
        { 
            System.out.println("\nThursday"); 
        } 
        else if(day==5) 
        { 
            System.out.println("\nFriday"); 
        } 
        else
        { 
            System.out.println("\nSaturday"); 
        } 
    } 
}