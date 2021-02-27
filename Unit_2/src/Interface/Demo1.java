/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author SONAL L R
 */
public class Demo1 {
    public static void main(String[]ags){
        demo1 obj=new demo1();
        obj.display();
        obj.show();
        
        int1 obj1=new demo1();
        obj1.display();
        
        int1.int2 obj2=new demo1();
        obj2.show();
    }
}
interface int1
{
    void display();
    interface int2
    {
        void show();
    }
}
class demo1 implements int1,int1.int2
{
    public void display()
    {
        System.out.println("First interface");
    }
    public void show()
    {
        System.out.println("Nested interface");
    }
}