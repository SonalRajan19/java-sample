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
public class Day_week_year {
    public static void main(String[] args) {
        int temp,year,week,day;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter days:");
        temp=S.nextInt();
        year=temp/365;
        temp=temp%365;
        System.out.println("Years:"+year);
        week=temp/7;
        temp=temp%7;
        System.out.println("Weeks:"+week);
        day=temp;
        System.out.println("Days:"+day);
    }
}
