/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_expression;
import java.util.ArrayList;
/**
 *
 * @author SONAL L R
 */
public class demo {
    //Predicate<Integer> obj;
        public static void main(String[] args){
            lamb obj= (int i,double j)-> System.out.println("Lambda Expression demo "+i);
            obj.display(5,10.5);
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(9);
            list.add(4);
            list.add(3);
            list.add(15);
            list.removeIf((Integer i)->i%2==0);
            System.out.println(list);
    }
}
interface lamb  //must have only one method
{
    void display(int i,double j);
}