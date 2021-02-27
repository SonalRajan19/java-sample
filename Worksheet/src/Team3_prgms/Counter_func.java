/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team3_prgms;

/**
 *
 * @author SONAL L R
 */
public class Counter_func {
    public static void main(String[] args) {
        System.out.println("Counter function using non static :");
        counter c1=new counter();
        counter c2=new counter();
        counter c3=new counter();
        System.out.println("Counter function using static :");
        counter2 c4=new counter2();
        counter2 c5=new counter2();
        counter2 c6=new counter2();
    }
}
class counter 
{
    int count=0;
    counter() 
    {
        count++;
        System.out.println(count);
    }
}
class counter2 
{
    static int count=0;
    counter2()
    {
        count++;
        System.out.println(count);
    }
}