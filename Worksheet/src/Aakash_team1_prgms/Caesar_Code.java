/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Caesar_Code {
    public static void main(String args[]){
        int j = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to convert it to Caesar code: ");
        String convert = input.next();
        // Converting string to character array
        char converted[] = convert.toCharArray();
        for( i = 0;i<=convert.length()-1;i++){
            converted[i]=(char)(converted[i]+3);
        }
        for(j = 0; j<=s.length()-1;j++){
            converted[i]=Character.toUpperCase(converted[i]);
        }
        System.out.println("Input string"+ convert);
        System.out.print("The Caesar code is"+ convert);
        System.out.print("testing");
    }
}