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
public class Deep_copying {
    public static void main(String[] args){
        sample1 obj=new sample1();  //memory
        System.out.println(obj);
        //sample obj1;  //reference
        sample1 obj1=new sample1();
        obj1.y=obj.y;
        System.out.println(obj1);
        System.out.println("\nValue of X and Y after changing:");
        obj1.x=4;
        obj1.y=5;
        System.out.println(obj);
        System.out.println(obj1);    
    }
}
class sample1
{
    int x=10,y=20;
    public String toString()
    {
        return "X:"+x+"\tY:"+y;
    }
}