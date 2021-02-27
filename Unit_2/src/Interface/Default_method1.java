/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author SONAL L R
 */
public class Default_method1 {
    public static void main(String[] args){ 
        sampleint1 d=new sampleint1();
        d.display(); 
        d.s();    
    } 
} 
interface art
{
    void display();
    default void s() 
    {  
        System.out.println("kk"); 
    } 
}
class sampleint1 implements art
{
    public void display() 
    {    
        System.out.println("Implemented display method in demo Interface");
    }
}