/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milesmeter;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Kilometer_to_Milesmeter {
    public void m()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Converting kilometer to meter:");
        System.out.println("Enter the kilometer:");
        double kilo=obj.nextDouble();
        double meter=kilo*1000;
        System.out.println(kilo+" kilometer="+meter+" meter");
        System.out.println("Converting kilometer to miles:");
        System.out.println("Enter the kilometer:");
        double kilo1=obj.nextDouble();
        double miles=kilo/1.609344;
        System.out.println(kilo+" kilometer="+miles+" miles");
    }
}
