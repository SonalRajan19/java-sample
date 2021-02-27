/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.util.Arrays;

/**
 *
 * @author Sonal L R
 */
public class Generic_function {
    public static void main(String[] args){
        Integer i[] = {2, 26, 4, 19, 22};
        Ascending<Integer> obj = new Ascending<>(i);   //passing integer
        obj.display();
       
        Double d[] = {44.00, 8567.00, 89893.00, 12226.00};
        Ascending<Double> obj1 = new Ascending<>(d);   //passing double
        obj1.display();
       
        Float f[] = {4969753.2f, 5642.1f, 4367.3f, 24636.2f}; //passing float
        Ascending<Float> obj2=new Ascending<>(f);
        obj2.display();
    }
}
class Ascending<A>
{
    A[] a;
    public Ascending(A[] a)
    {
        this.a=a;
    }
    public void display()
    {
       Arrays.sort(a);   //sorting in ascending order
       System.out.println(Arrays.toString(a));
    }
}
