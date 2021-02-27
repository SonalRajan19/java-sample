/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author SONAL L R
 */
public class demo {
    public static void main(String[] args){
        sample obj=new sample1();  
        obj.display();       
    }  
}
abstract class sample 
{
    abstract void display();
}
class sample1 extends sample {

    public void display() {
        System.out.println("Implemented Abstract Method");
    }
}