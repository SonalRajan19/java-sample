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
public class Multiple_inher {
    public static void main(String[] args){ 
        demo d=new sampleint();    
        d.display();
        demo1 d1=new sampleint();  
        d1.display1(); 
    }  
}
interface demo
{
    void display(); 
} 
interface demo1
{
    void display1();
}
class sampleint implements demo,demo1 
{
    public void display()
    {
        System.out.println("Implemented display method in demo Interface");  
    }
    public void display1() 
    {
        System.out.println("Implemented display1 method in demo1 Interface");   
    }
} 