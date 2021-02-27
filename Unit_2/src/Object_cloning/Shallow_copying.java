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
public class Shallow_copying {
    public static void main(String[] args){
        sample obj=new sample();  //memory
        System.out.println(obj);
        sample obj1;  //reference
        //or sample obj1=new sample();
        obj1=obj;
        System.out.println(obj1);
        System.out.println("\nValue of X after changing:");
        obj1.x=4;
        System.out.println(obj);
        System.out.println(obj1);          
    }
}
class sample {
    int x=10,y=20;
    public String toString()
    {
        return "X:"+x+"\tY:"+y;
    }
}
