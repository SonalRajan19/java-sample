/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_1;

/**
 *
 * @author SONAL L R
 */
class Parent {  } 
class Child extends Parent { } 
public class Demo3 {
     public static void main(String[] args) 
    { 
        Child pobj = new Child(); 
        if (pobj instanceof Parent) 
           System.out.println("pobj is instance of Child"); 
        else
           System.out.println("pobj is NOT instance of Child"); 
    } 
}
