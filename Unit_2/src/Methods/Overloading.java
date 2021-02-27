/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author SONAL L R
 */
public class Overloading {
    public static void main(String[] args){
        art obj=new art();
        art obj1=new art("Baruni");
        obj.add(2,3);
        obj.add(2,4,6);
        obj.add("Sonal ", "Shibani");
    }
}
class art
{
    art()
    {
        System.out.println("CSE");
    }
    art(String a)
    {
        System.out.println("CSE");
    }
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void add(String a,String b)
    {
        System.out.println(a+b);
    }
}