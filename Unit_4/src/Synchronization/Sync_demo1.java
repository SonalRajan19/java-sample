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
public class Sync_demo1 {
    public static void main(String[] args){
        table obj=new table();
        thr1 t1=new thr1(obj);
        thr2 t2=new thr2(obj);
        thr3 t3=new thr3(obj);
        thr4 t4=new thr4(obj);
        
        table obj1=new table();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class table1 
{
    synchronized public void print(int n)
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
class thr1 extends Thread
{
    table t;
    thr1(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(2);
    }
}
class thr2 extends Thread
{
    table t;
    thr2(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(3);
    }
}
class thr3 extends Thread
{
    table t;
    thr3(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(4);
    }
}
class thr4 extends Thread
{
    table t;
    thr4(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(5);
    }
}