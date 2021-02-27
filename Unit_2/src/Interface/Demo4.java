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
public class Demo4 {
    public static void main(String[] args){
        demos d=new sampleint();  
        d.display(); 
    }     
}
interface demos
{
    void display();
} 
class sampleint implements demos
{
    public void display()  
    {
        System.out.println("Implemented Interface Method");  
    }
} 