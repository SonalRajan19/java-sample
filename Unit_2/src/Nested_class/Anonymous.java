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
public class Anonymous {
    public static void main(String[] args){
        sample obj=new sample()
        {
            void display()
            {
                System.out.println("Anonymous Inner Class");
            }
        };
        obj.display();
        sample1 obj1=new sample1()
        {
            void display1()
            {
                System.out.println("Anonymous Inner Class");
            }
        };
        obj1.display1();
    }
}
abstract class sample
{
    abstract void display();
    {
        
    }
}
abstract class sample1
{
    abstract void display1();
    {
        
    }
}
/*class test extends sample
{
    void display()
    {
        
    }
}*/