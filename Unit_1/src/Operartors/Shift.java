/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operartors;

/**
 *
 * @author SONAL L R
 */
public class Shift {
    public static void main(String[] args){ 
        System.out.println("Left shift:");
        System.out.println(10<<2);//10*2^2=10*4=40 
        System.out.println(10<<3);//10*2^3=10*8=80  
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println("Right shift:");
        System.out.println(15<<4);//15*2^4=15*16=240 
        System.out.println(10>>2);//10/2^2=10/4=2  
        System.out.println(20>>2);//20/2^2=20/4=5 
        System.out.println(20>>3);//20/2^3=20/8=2 
    }
}