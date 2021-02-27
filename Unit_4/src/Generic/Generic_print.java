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
public class Generic_print {
    public static void main(String[] args){
        Integer num[]={2,3,4,5,6,7,8,9,10};
        test4<Integer> obj=new test4<>(num);
        obj.display();
        
        Character c[]={'j','a','v','a'};
        test4<Character> obj1=new test4<>(c);
        obj1.display();
        
        student s[]=new student[3];
        s[0]=new student("aaa",100);
        s[1]=new student("bbb",101);
        s[2]=new student("ccc",102);
        
        test4<student> obj2=new test4<>(s);
        obj2.display();
    }
}
class test4<T>
{
    T[] value;
    public test4(T[] value) 
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