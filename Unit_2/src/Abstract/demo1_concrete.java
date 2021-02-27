/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author SONAL L R
 */
public class demo1_concrete {
    public static void main(String[] args) {  
        sample2 obj=new sample3(); 
        obj.display();
        obj.show();
    } 
}
abstract class sample2 
{
    abstract void display();
    void show()
    {
        System.out.println("Concrete Method in Abstract class");     
    }
}
class sample3 extends sample2
{     
    public void display()
    { 
        System.out.println("Implemented Abstract Method");
    }
}