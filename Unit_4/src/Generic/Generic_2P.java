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
public class Generic_2P {
    public static void main(String[] args){
        test<Integer,Character> obj=new test<>(87,'s');
        System.out.println(obj.getvalue());
        System.out.println(obj.getvalue1());
        obj.display();
        
        test<String,Double> obj1=new test<>("java",12.00);
        System.out.println(obj1.getvalue());
        System.out.println(obj1.getvalue1());
        obj1.display();
    }
}
class test<T,V>
{
    T value;
    V value1;
    public test(T value, V value1)
    {
        this.value=value;
        this.value1=value1;
    }
    public T getvalue()
    {
        return value;
    }
    public V getvalue1()
    {
        return value1;
    }
    public void display()
    {
        System.out.println(value.getClass().getName());
        System.out.println(value1.getClass().getName());
    }
}