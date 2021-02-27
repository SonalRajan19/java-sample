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
public class Parent_class_cons {
    public static void main(String args[]){     
        Bike5 b=new Bike5();          
    }
}
class Vehicle1
{
    Vehicle1()
    {
        System.out.println("Vehicle is created");
    }
}
class Bike5 extends Vehicle1
{ 
    Bike5()
    { 
        super();
        System.out.println("Bike is created");  
    }//will invoke parent class constructor  
}     