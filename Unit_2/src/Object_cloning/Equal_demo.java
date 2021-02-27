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
public class Equal_demo {
    public static void main(String[] args){
        sample3 obj=new sample3();
        sample3 obj1=obj;
        obj1.y=90;
        System.out.println(obj);
        System.out.println(obj);
        if(obj.equals(obj1))
        { 
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
class sample3
{
    int x=10,y=20;
    public String toString()
    {
        return "X:"+x+"\tY:"+y;
    }
}