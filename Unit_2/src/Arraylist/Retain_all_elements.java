/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author SONAL L R
 */
public class Retain_all_elements {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
            list.add(10);
            list.add(3);
            list.add(45);
            list.add(78);
            list.add(2);
            list.add(90);
            list.add(45);
            list.add(2,60); //index
            System.out.println(list);
        
            ArrayList<Integer> list1=new ArrayList<>();
            list1.add(5);
            list1.add(6);
            list1.add(7);
            list.addAll(list1); //add list
            list.retainAll(list1);
    }
}
