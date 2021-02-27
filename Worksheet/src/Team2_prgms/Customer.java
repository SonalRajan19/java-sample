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
public class Customer {
    public static void main(String[] args) {
        Customerdata ob=new Customerdata();
        ob.getdata();
        ob.calc();
        ob.display();
    }
}
class Customerdata
{
    Scanner in=new Scanner(System.in);
    Scanner ins=new Scanner(System.in);
    String name;
    int no;
    int type;
    double current,prev,total,units;
    void getdata()
    {
        System.out.println("Enter consumer no:");
        no=in.nextInt();
        System.out.println("Enter consumer name:");
        name=ins.nextLine();
        System.out.println("Enter previous month reading:");
        prev=in.nextDouble();
        System.out.println("Enter current month reading:");
        current=in.nextDouble();
        System.out.println("Enter Type of connection(0 for Domestic or 1 for Commercial):");
        type=ins.nextInt();
    }
    void calc()
    {
        units=current-prev;
        if(type==0)
        {
            if (units<=100)
                total=1*units;
            else if (units>100 && units<=200)
                total=2.50*units;
            else if(units>200 && units<=500)
                total= 4*units;
            else
                total= 6*units;
        }
        else
        {
            if (units<=100)
                total=2*units;
            else if(units>100 && units<=200)
                total=4.50*units;
            else if(units>200 && units<=500)
                total=6*units;
            else
                total=7*units;
        }
    }
    void display()
    {
        System.out.println("Consumer number:"+no);
        System.out.println ("Consumer name:"+name);
        if(type==0)
            System.out.println("Connection:DOMESTIC");
        else
            System.out.println("Connection:COMMERCIAL");
            System.out.println("Current Month Reading:"+current);
            System.out.println("Previous Month Reading:"+prev);
            System.out.println("Total units:"+units);
            System.out.println("Total bill:RS"+total);
    }
}