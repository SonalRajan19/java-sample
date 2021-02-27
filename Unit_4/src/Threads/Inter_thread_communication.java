/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Sonal L R
 */
public class Inter_thread_communication {
    public static void main(String[] args){
        A p=new A();
        new producer(p);
        new consumer(p);
    }
}
class A
{
    int n;
    boolean value=false;
    synchronized int get()
    {
        while(!value)
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Got: "+n);
        value=false;
        notify();
        return n;
    }
    synchronized int put()
    {
        while(value)
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        this.n=n;
        System.out.println("Put: "+ n);
        value=true;
        notify();
    }
}
class producer implements Runnable
{
    A p;
    producer(A P)
    {
        this.p=p;
        new Thread(this,"producer").start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            p.put(i++);
        }
    }
}
class consumer implements Runnable
{
    A p;
    consumer(A P)
    {
        this.p=p;
        new Thread(this,"consumer").start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            p.get();
        }
    }
}