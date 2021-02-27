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
public class Local_innerclass {
    public static void main(String[] args){
        outer1 obj=new outer1();
        obj.display();
    }
}
class outer1
{
    void display()
    {
        class inner
        {
            void display1()
            {
                System.out.println("Local inner class method");
            }
        }
        inner obj1=new inner();
        obj1.display1();
    }
}
