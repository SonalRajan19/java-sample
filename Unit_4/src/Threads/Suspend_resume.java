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
public class Suspend_resume {
    public static void main(String[] args){
        test1 m1=new test1("One");
        test1 m2=new test1("Two");
        test1 m3=new test1("Three");
        m1.t.setPriority(m1.t.getPriority()+2); //5+2=7
        m2.t.setPriority((Thread.MIN_PRIORITY)+2); //1+2=3
        m3.t.setPriority(Thread.MAX_PRIORITY); //10
        try
        {
            m1.t.suspend();
            System.out.println("Suspend Thread m1");
            Thread.sleep(500);
            m1.t.resume();
            System.out.println("Resume Thread m1");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println("waiting for the child thread to complete");
            m1.t.join();
            m2.t.join();
            m3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Main Thread Exists");
        //System.out.println(m1.t.isAlive());
    }
}
class test1 implements Runnable
{
    String name;
    Thread t;
    test1(String n)
    {
        name=n;
        t=new Thread(this,name);
        System.out.println("Child Thread "+t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=4;i>0;i--)
            {
                System.out.println("Child "+name+" Thread "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Child Thread "+name+" Exists.");
    }
}