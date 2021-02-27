/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author SONAL L R
 */
public class Superclass {
    public static void main(String[] args){
        bike obj=new bike();
        obj.display();
    }
}
class vehicle
{
    int speed=50;
    vehicle()
    {
        System.out.println("Vehicle class:");
    }
    void display()
    {
        System.out.println("Vehicle information:");
    }
}
class bike extends vehicle
{
    int speed=100;
    bike()
    {
        super();
        System.out.println("Bike class");
    }
    void display()
    {
        super.display();
        System.out.println(super.speed);
        System.out.println(speed);
    }
}