/*
Define an abstract class “car” with members reg_no, model, reg_date. 
Define two subclasses of this class – “transportVehicles ” (validity_no, start_date, period)
and “privateVehicle ” (owner_name, owner_address). Define appropriate constructors. 
Create n objects which could be of either transportVehicles or privateVehicle class by 
asking the user’s choice. Display details of all “privateVehicle” objects and all “transportVehicles” objects.
 */
package unit_2;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Aakash_prgm {
    public static void main(String[] args){
        transportVehicles t=new transportVehicles();
        privateVehicles p=new privateVehicles();
        System.out.println("Enter the transport vehicle details:");
        t.getdetails();
        System.out.println("Enter private vehicled details:");
        p.getdetails();
        System.out.println("Transport Vehicle details:");
        t.gettransportVehdetails();
        System.out.println("Private Vehicle details:");
        p.getprivateVehdetails();
    }
}
abstract class Car
{
    String reg_no;
    String model;
    int reg_date;
    Scanner obj=new Scanner(System.in);
    void getdetails()
    {
        System.out.println("Enter Registration number:");
        reg_no=obj.next();
        System.out.println("Enter the Model:");
        model=obj.next();
        System.out.println("Enter the Registration date:");
        reg_date=obj.nextInt();
    }
    public String toString()
    {
        return "Registration number is:"+reg_no+"\nModel is:"+model+"\nRegistration date is:"+reg_date;
    }
}
class transportVehicles extends Car
{
    int validity_no;
    int start_date;
    String period;
    Scanner obj1=new Scanner(System.in);
    void gettransportVehdetails()
    {
        System.out.println("Enter Validity number:");
        validity_no=obj1.nextInt();
        System.out.println("Enter Start date:");
        start_date=obj1.nextInt();
        System.out.println("Enter the period:");
        period=obj1.next();
    }
    public String toString()
    {
        return "\nValidity number is:"+validity_no+"\nStart date is:"+start_date+"\nPeriod is:"+period;
    }
}
class privateVehicles extends Car
{
    String owner_name;
    String owner_address;
    Scanner obj2=new Scanner(System.in);
    void getprivateVehdetails()
    {
        System.out.println("Enter Owner name:");
        owner_name=obj2.next();
        System.out.println("Enter Owner address:");
        owner_address=obj2.next();
    }
    public String toString()
    {
        return "Owner name is:"+owner_name+"\nOwner address is:"+owner_address;
    }
}