/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_handling;

/**
 *
 * @author SONAL L R
 */
public class Student_demo {
    public static void main(String[] args) {
        // TODO code application logic here
        batch b=new batch();
        student std=new student(5,"Sonal");
        try 
        {
            b.getstudent(std);
        }
        catch (studentnotfoundexception e) 
        {
            System.out.println("Exception:"+e.getMessage());
        }
    }
}
class student
{
    int id;
    String name;
    student(int i,String n) 
    {
        id = i;
        name = n;
    }
    public int getid()
    {
        return id;
    }
    public String getname() 
    {
        return name;
    }
}
class batch 
{
    student[] students;
    int studentcount;
    batch() 
    {
        students=new student[4];
        students[0]=new student(1,"Aakash");
        students[1]=new student(2,"Shibani");
        students[2]=new student(3,"Vasanth");
        students[3]=new student(4,"Baruni");
        studentcount = 4;
    }
    void getstudent(student std) throws studentnotfoundexception 
    {
        for(int i=0;i<studentcount;i++) 
        {
            if (students[i].getid()==std.getid() && students[i].getname().equals(std.getname())) 
            {
                System.out.println(std.id + "...." + std.name);
            }
        }
        throw new studentnotfoundexception("Student not found");
    }
}
class studentnotfoundexception extends Exception 
{
    studentnotfoundexception(String msg)
    {
        super(msg);
    }
}