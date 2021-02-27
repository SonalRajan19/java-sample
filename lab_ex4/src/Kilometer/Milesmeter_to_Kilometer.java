/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kilometer;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Milesmeter_to_Kilometer {
    public void k()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Converting meter to kilometer:");
        System.out.println("Enter the meter:");
        double meter=obj.nextDouble();
        double kilometer=meter/1000;
        System.out.println(meter+" meter="+kilometer+" kilometer");
        System.out.println("Converting miles to kilometer:");
        System.out.println("Enter the miles:");
        double miles=obj.nextDouble();
        double kilometer1=miles*1.609344;
        System.out.println(miles+" miles="+kilometer1+" kilometer");
    }
}
