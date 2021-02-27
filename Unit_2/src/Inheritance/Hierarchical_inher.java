/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author SONAL L R
 */
public class Hierarchical_inher {
    public static void main(String[] args) 
    { 
        student st=new student("Sonal","19cse087","CSE"); 
        System.out.println(st); 
        staff sf=new staff("Revathi","cse1001","CSE"); 
        System.out.println(sf);     
    }  
} 
class college 
{    
    String cname; 
    int ccode; 
    college() 
    { 
        cname="VCET"; 
        ccode=9131;    
    } 
}
class student extends college 
{   
    String sname; 
    String srollno;   
    String sdept;
    student(String n,String r,String d)  
    { 
        sname=n;
        srollno=r;
        sdept=n;     
    } 
    public String toString()
    { 
        return "College Name:"+cname+"\nCollege Code:"+ccode+"\nStudent Name:"+sname+"\nRoll no:"+srollno+"\nDept"+sdept;
    }
}
class staff extends college
{ 
    String sname;
    String sid;
    String dept;
    staff(String n,String r,String d)
    { 
        sname=n; 
        sid=r;
        dept=n;
    }
    public String toString() 
    {
        return "Staff Name:"+sname+"\nStaff id:"+sid+"\nDept:"+dept;
    }
} 