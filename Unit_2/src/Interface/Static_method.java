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
public class Static_method {
    public static void main(String[] args){
        defl1 obj=new demo4();
        obj.display();
        obj.display1();
        
        demo obj1=new demo();
        obj1.display();
        obj1.display1();
        defl1.display2();
    }
}
interface defl1
{
    void display();
    default void display1()
    {
        System.out.println("Default method implementation");
    }
    static void display2()
    {
        System.out.println("Static method implementation");
    }
}
class demo4 implements defl1
{
    public void display()
    {
        System.out.println("Interface abstract method");
    }
}