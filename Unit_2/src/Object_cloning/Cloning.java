/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object_cloning;

/**
 *
 * @author SONAL L R
 */
public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        sample2 obj=new sample2();  //memory
        sample2 obj1=(sample2)obj.clone();
        System.out.println(obj1);
        obj1.x=90;
        System.out.println("\nValue of X after changing:");
        System.out.println(obj1);    
    }
}
class sample2 implements Cloneable //interface Cloneable
{
    int x=10,y=20;
    public String toString()
    {
        return "X:"+x+"\tY:"+y;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}