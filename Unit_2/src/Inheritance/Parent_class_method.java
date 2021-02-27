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
public class Parent_class_method {
    public static void main(String[] args){
        Student16 s=new Student16();  
        s.display();   
    }   
}
class Person
{
    void message()
    {
        System.out.println("welcome");
    }
}
class Student16 extends Person
{
    void message()
    {
        System.out.println("welcome to java");
    }
    void display()
    { 
        message();//will invoke current class message() method   
        super.message();//will invoke parent class message() method   
    } 
}