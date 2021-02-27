/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author Sonal L R
 */
public class Generic_sum {
    public static void main(String[] args){
        Integer num[]={2,3,4,5,6,7,8};
        test2<Integer> obj=new test2<>(num);
        obj.sum();
        
        Float fnum[]={2.1f,3.2f,4.3f};
        test2<Float> obj1=new test2<>(fnum);
        obj1.sum();
        
        Double dnum[]={2.0,3.1,4.2};
        test2<Double> obj2=new test2<>(dnum);
        obj2.sum();
        
        /*Character cnum[]={'o','o','p','s'};
        test2<Character> obj3=new test2<>(cnum);
        obj3.sum();*/
    }
}
class test2<T extends Number>
{
    T[] value;
    double sum=0;
    public test2(T[] value)
    {
        this.value=value;
    }
    public void sum()
    {
        for(int i=0;i<value.length;i++)
        {
            sum+=value[i].doubleValue();
        }
        System.out.println(sum/value.length);
    }
}