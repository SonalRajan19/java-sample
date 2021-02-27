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
public class demo1 {
    public static void main(String[] args){
        lamb1 obj= (int i,double j)->
        {
                System.out.println(i);
                System.out.println(j);
        };
        
        obj.display(5,10.5);
        ArrayList<String> list=new ArrayList<String>();
            list.add("Sonal");
            list.add("Aakash");
            list.add("Vasanth");
            list.add("Baruni");
            list.removeIf(s->s.startsWith("B"));
            System.out.println(list);
    }
}
interface lamb1  //must have only one method
{
    void display(int i,double j);
}