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
public class Generic_present_notpresent {
    public static void main(String[] args)
    {
        Integer num[]={2,3,4,5,6};
        test3<Integer,Integer> obj=new test3<>();
        obj.search(5,num);
        
        String s[]={"oops","java","class"};
        test3<String,String> obj1=new test3<>();
        obj1.search("oops",s);
    }
}
class test3<T,V>
{
    boolean flag=false;
    public <T,V> void search(T s,V[] value)
    {
        for(int i=0;i<value.length;i++)
        {
            if(s.equals(value[i]))
            {
                flag=true;
                break;
            }
            else
                flag=false;
        }
        if(flag)
            System.out.println("Present");
        else
            System.out.println("Not present");
    }
}