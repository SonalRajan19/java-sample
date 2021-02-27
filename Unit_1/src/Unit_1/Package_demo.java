/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_1;

/**
 *
 * @author SONAL L R
 */
public class Package_demo {
    public static void main(String[] args){ 
        Student st[]=new Student[2]; 
        st[0]=new Student(1001,"Sonal","Canada");  
        st[1]=new Student(1002,"Shibani","Washington");  
        st[0].showDetails(); 
        st[1].showDetails(); 
    }  
}
class Student 
{ 
    private int rollno;  
    private String name; 
    private String address; 
    public Student(int rno,String sname,String sadd) 
    { 
        rollno=rno;  
        name=sname;  
        address=sadd; 
    } 
    public void showDetails() 
    { 
        System.out.println("Roll No::"+rollno);  
        System.out.println("Name::"+name);  
        System.out.println("Address::"+address); 
    } 
} 