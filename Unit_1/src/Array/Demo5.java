/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author SONAL L R
 */
public class Demo5 {
    public static void main(String[] args){
        // TODO code application logic here
        art obj=new art(10,20);
        obj.show();
    }
}
class art
{
    int a,b;
    art(int a,int b)
    {
        a=a;
        b=b;
        System.out.println(a+b);
    }
    void show()
    {
        System.out.println(a+b);
    }
}