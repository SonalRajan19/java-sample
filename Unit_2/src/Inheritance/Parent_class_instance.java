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
public class Parent_class_instance {
    public static void main(String args[]){
        Bike4 b=new Bike4(); 
        b.display();
    }  
}
class Vehicle
{
    int speed=50;
}   
class Bike4 extends Vehicle
{ 
    int speed=100;
    void display()
    { 
        System.out.println(super.speed);
    }   //will print speed of Vehicle now      
}