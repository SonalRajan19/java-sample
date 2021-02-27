/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Synchronization;

/**
 *
 * @author Sonal L R
 */
public class Sync_demo2 {
    public static void main(String[] args){
        table obj=new table();
        th5 t1=new th5(obj);
        th6 t2=new th6(obj);
        th7 t3=new th7(obj);
        th8 t4=new th8(obj);
        
        table obj1=new table();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class table2
{
    public void print(int n) //synchronized method
    {
        synchronized(this) //block
        {
            for(int i=1;i<=5;i++)
            {
                try
                {
                    System.out.println(i+"*"+n+"="+i*n);
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class th5 extends Thread
{
    table t;
    th5(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(2);
    }
}
class th6 extends Thread
{
    table t;
    th6(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(3);
    }
}
class th7 extends Thread
{
    table t;
    th7(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(4);
    }
}
class th8 extends Thread
{
    table t;
    th8(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(5);
    }
}