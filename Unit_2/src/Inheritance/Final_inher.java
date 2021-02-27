/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author SONAL L R
 */
public class Final_inher {
    public static void main(String[] args){
        
    }
}
final class test  //cannot inherit
{
    final int a=10; //the value cannot be changed
    final void display()  //cannot override
    {
        //a=a+10;
        System.out.println(a);
    }
}
/*class derived extends test
{
    void display()
    {
        
    }
}*/