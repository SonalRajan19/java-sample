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
public class Using_string {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Rajan");
        list.add("Sonal");
        list.add("Subalakshmi");
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        //list.removeIf(s -> s.startsWith("b"));
        //System.out.println(list);
        list.removeIf(s -> s.endsWith("i"));
        System.out.println(list);
        list.replaceAll(s -> s.toUpperCase());
        System.out.println(list);
        /*for(String i:list)
        {
            System.out.println(i);
        }*/
        list.forEach(i -> System.out.println(i));
    }
}
