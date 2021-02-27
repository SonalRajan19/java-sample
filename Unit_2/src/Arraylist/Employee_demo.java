/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author SONAL L R
 */
public class Employee_demo {
    public static void main(String[] args){
        employee e=new employee("Rajan",300000);
        //System.out.println(e);
        ArrayList<employee> list=new ArrayList<>();
        list.add(e);
        list.add(new employee("Sonal",250000));
        list.add(new employee("Shibani",350000));
        list.add(new employee("Suba",400000));
        list.add(new employee("Shaksi",150000));
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println(list);
        Collections.sort(list,new salarysort());
        System.out.println(list);
    }
}
class employee
{
    String name;
    double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\nEmployee name:"+name+"\tSalary:"+salary;
    }
}
class namesort implements Comparator<employee>
{
    @Override
    public int compare(employee e,employee e1)
    {
        return e1.name.compareTo(e.name);   //positive/negative
    }
}
class salarysort implements Comparator<employee>
{
    @Override
    public int compare(employee e,employee e1)
    {
        return (int)(e.salary-e1.salary);   //positive/negative
    }
}