/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_class;
import Kilometer.*; 
import Milesmeter.*;
/**
 *
 * @author SONAL L R
 */
public class Conversion {
    public static void main(String[] args) {
        System.out.println("DISTANCE CONVERTER");
        Milesmeter_to_Kilometer obj=new Milesmeter_to_Kilometer();
        obj.k();
        Kilometer_to_Milesmeter obj1=new Kilometer_to_Milesmeter();
        obj1.m();
    }
}