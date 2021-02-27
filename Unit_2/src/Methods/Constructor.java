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
public class Constructor {
    public static void main(String[] args){
        c obj=new c(); 
    }
}
class a
{
    a()
    {
        System.out.println("Class A");
    }
}
class b extends a
{
    b()
    {
        System.out.println("Class B");
    }
}
class c extends a
{
    c()
    {
        System.out.println("Class C");
    }
}