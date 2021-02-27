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
public class Default_method {
    public static void main(String[] args){
        defl obj=new demo2();
        obj.display();
        obj.display1();
        
        demo2 obj1=new demo2();
        obj1.display();
        obj1.display1();
    }
}
interface defl
{
    void display();
    default void display1()
    {
        System.out.println("Default method implementation");
    }
}
class demo2 implements defl
{
    public void display()
    {
        System.out.println("Interface abstract method");
    }
}
