/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda_expression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author SONAL L R
 */
public class Custom_sort {
    public static void main(String[] args){
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(103);
        obj.add(336);
        obj.add(282);
        obj.add(419);
        Collections.sort(obj,new custom());
        System.out.println(obj);
    }
}
class custom implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        return i1%10-i2%10;
    }
}