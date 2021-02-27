/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team3_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Measure {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter dimension:");
        int a = obj.nextInt();
        circle obj1 = new circle(a);
        obj1.circle();
        square obj2 = new square(a);
        obj2.square();
        sphere obj3 = new sphere(a);
        obj3.sphere();
    }
}
class shape
{
    double d;
    shape(double d) 
    {
        this.d = d;
    }
}
class circle extends shape
{
    circle(double d)
    {
        super(d);
    }
    void circle() 
    {
        System.out.println("Area of a circle is:"+(Math.PI*d*d));
        System.out.println("Circumference of the circle is:"+(Math.PI*d*2));
    }
}
class square extends shape
{
    square(double d) 
    {
        super(d);
    }
    void square()
    {
        System.out.println("Area of the square is:"+(d*d));
        System.out.println("Circumference of the square is:"+(4*d));
    }
}
class sphere extends shape 
{
    sphere(double d)
    {
        super(d);
    }
    void sphere() 
    {
        System.out.println("Volume of the sphere is:"+(4/3*Math.PI*d*d*d));
        System.out.println("Surface area of shphere:"+(Math.PI*d*d*4));
    }
}
