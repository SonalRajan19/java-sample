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
public class Generic_find_elements {
    public static void main(String[] args){
        Integer num[]={2,3,4,5,6,7,8};
        test1<Integer> obj=new test1<>(num);
        obj.display();
        
        Character cnum[]={'j','a','v','a'};
        test1<Character> obj1=new test1<>(cnum);
        obj1.display();
        
        student1 s1[]=new student1[3];
        s1[0]=new student1("aaa",1);
        s1[1]=new student1("bbb",2);
        s1[2]=new student1("ccc",3);
        
        test1<student1> obj2=new test1<>(s1);
        obj2.display();
    }
}
class test1<T>
{
    T[] value;
    public test1(T[] value)
    {
        this.value=value;
    }
    public void display()
    {
        for(int i=0;i<value.length;i++)
        {
            System.out.println(value[i]); 
        }
    }
}
class student1
{
    String name;
    int rollno;
    public student1(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    public String toString()
    {
        return "student("+"name:"+name+",rollno:"+rollno+")";
    }
}