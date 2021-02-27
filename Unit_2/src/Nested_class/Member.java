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
public class Member {
    public static void main(String[] args){
        outer obj=new outer();
        obj.display1();
        
        outer.inner obj1=obj.new inner();
        obj1.display();
    }
}
class outer
{
    private int a=10;
    class inner
    {
        void display()
        {
            System.out.println("Inner class method "+a);
        }
    }
    void display1()
    {
        System.out.println("Outer class method");
    }
}