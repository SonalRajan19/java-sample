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
public class Employee {
     public static void main(String[] args) {
        employee emp=new employee();
        emp.getid();
        emp.getfname();
        emp.getlname();
        emp.getname();
        emp.getsalary();
        emp.setsalary();
        emp.getansalary();
        emp.raisesalary();
        emp.tostring();
    }
}
class employee
{
    Scanner in=new Scanner(System.in);
    Scanner ins=new Scanner(System.in);
    String fname,lname,name;
    int id,setsalary,salary,newsalary,percent;
    int getid()
    {
        System.out.println("Enter employee id:");
        id=in.nextInt();
        return id;
    }
    String getfname()
    {
        System.out.println("Enter first name:");
        fname=ins.nextLine();
        return fname;
    }
    String getlname()
    {
        System.out.println("Enter last name:");
        lname=ins.nextLine();
        return lname;
    }
    String getname()
    {
        name=fname+lname;
        return name;
    }
    int getsalary()
    {
        System.out.println("Enter employee salary:");
        id=in.nextInt();
        return salary;
    }
    void setsalary()
    {
        System.out.println("Set salary percent:");
        setsalary=in.nextInt();
    }
    int getansalary()
    {
        int ansalary=salary*12;
        return ansalary;
    }
    int raisesalary()
    {        
        newsalary=(setsalary/100)*salary;
        return newsalary;
    }
    void tostring()
    {
        System.out.println("Employee id:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee salary:"+newsalary);       
    }
}