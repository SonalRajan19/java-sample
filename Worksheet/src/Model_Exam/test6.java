/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Exam;

import java.util.ArrayList;

/**
 *
 * @author Sonal L R
 */
public class test6 {
    public static void main(String[] args){
        ArrayList obj1=new ArrayList();

        ArrayList obj2=new ArrayList();

        obj1.add("A");

        obj1.add("B");

        obj2.add("A");

        obj2.add(1,"B");                                          

        System.out.println(obj1.equals(obj2));
    }
}
