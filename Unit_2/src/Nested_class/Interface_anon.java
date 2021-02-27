/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nested_class;

/**
 *
 * @author SONAL L R
 */
public class Interface_anon {
    public static void main(String[] args){
        demo obj=new demo()
        {
            public void display()
            {
                System.out.println("Interface method");
            }
        };
        obj.display();
        demo1 obj1=new demo1()
        {
            public void display()
            {
                System.out.println("Abstract method");
            }
        };
        obj1.display1();
    }
}
interface demo
{
    void display();
}
abstract class demo1
{
    abstract void display1();
}