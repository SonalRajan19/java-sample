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
public class Static_method1 {
    public static void main(String[] args){
        sampleint2 d=new sampleint2(); 
        d.display();  
        demo.st(); 
    }
} 
interface art1
{
    void display();   
    static void st()  
    {
        System.out.println("inside static method"); 
    }
}
class sampleint2 implements art1
{
    public void display()
    {
        System.out.println("Implemented display method in demo Interface");    
    }
}