/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class demo2 {
    public static void main(String[] args){
        abs obj=new circle();
        obj.read();
        obj.findarea();
        obj.display();
        
        obj=new square();
        obj.read();
        obj.findarea();
        obj.display();
        
        //or
        circle obj2=new circle();
        obj2.read();
    }
}
abstract class abs
{
    abstract void read();
    abstract void findarea();
    abstract void display();
    Scanner obj=new Scanner(System.in);
    void demo()
    {
        System.out.println("Abstract demo:");
    }
}
class circle extends abs
{
    double radius,area;
    void read()
    {
        radius=obj.nextDouble();
    }
    void findarea()
    {
        area=Math.PI*radius*radius;
    }
    void display()
    {
        System.out.println("Area of the circle is:"+area);
    }
}
class square extends abs
{
    double side,area;
    void read()
    {
        side=obj.nextInt();
    }
    void findarea()
    {
        area=4*side;
    }
    void display()
    {
        System.out.println("Area of the circle is:"+area);
    }
}