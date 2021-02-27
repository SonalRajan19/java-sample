/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nested_class;

/**
 *
 * @author SONAL L R
 */
public class Static_innerclass {
    public static void main(String[] args){
        staticdemo.demo obj=new staticdemo.demo();
        obj.display();
    }
}
class staticdemo
{
    static class demo
    {
        void display()
        {
            System.out.println("Static method");
        }
    }
}