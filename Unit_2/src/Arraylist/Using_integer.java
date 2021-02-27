/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/**
 *
 * @author SONAL L R
 */
public class Using_integer {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(45);
        list.add(78);
        list.add(2);
        list.add(90);
        list.add(45);
        list.add(2,60);
        System.out.println(list);
        
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list.addAll(list1);
        //list.removeAll(list);
        //list.removeIf(s -> s<10); //lambda (s) -> expression
        //list1.remove(1); 
        //list.replaceAll(s->s*2);
        //list.retainAll(list1);
        //System.out.println(list.get(5));
        //list.set(5,100);
        //System.out.println(list.get(5));
        //list.clear();
        //System.out.println(list.isEmpty());
        //Collections.sort(list);
        //Collections.sort(list,Collections.reverseOrder());    //in reverse order
        //System.out.println(list);
        //Collections.reverse(list);
        System.out.println(list);
        /*System.out.println("Updated list is:"+list);          //arraylist
        for(int i:list)   //for(i=0;i<a.length;i++)
        {
            System.out.println(i);
        }*/
        /*java.util.Iterator itr=list.iterator();               //iterator
        while(itr.hasNext())    //10,20,30 last element
        {
            System.out.println(itr.next());
        }*/  
    }
}
