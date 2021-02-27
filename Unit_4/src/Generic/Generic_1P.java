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
public class Generic_1P {
    public static void main(String[] args){
        sample<Integer> obj=new sample<>(87);
        System.out.println(obj.getObject());
        obj.show();
        
        sample<String> obj1=new sample<>("oops");
        System.out.println(obj1.getObject());
        obj1.show();
        
        sample<Character> obj2=new sample<>('s');
        System.out.println(obj2.getObject());
        obj2.show();
        
        sample<Double> obj3=new sample<>(8.02);
        System.out.println(obj3.getObject());
        obj3.show();
        
        student s=new student("Sonal",87);
        sample<student> obj4=new sample<>(s); //user defined class
        System.out.println(obj4.getObject());
        obj4.show();
    }
}
class sample<T>
{
    T value;
    sample(T value)
    {
        this.value=value;
    }
    T getObject()
    {
        return value;    
    }
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
}
class student
{
    String name;
    int rollno;
    public student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    public String toString()
    {
        return "student("+"name:"+name+",rollno:"+rollno+")";
    }
}