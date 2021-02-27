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
public class Demo {
    public static void main(String[] args){
        inter obj=new sample();
        obj.display();
        sample obj1=new sample();
        obj1.display1();
    }
}
interface inter
{
    int a=10;
    void display();
}
interface inter1
{
    void display1();
}
class sample implements inter,inter1
{
    public void display()
    {
        //a=a+10; 
        System.out.println("Interface implementation 1:"+(a+10));
    }
    public void display1()
    {
        System.out.println("Interface implementation 2:");
    }
}