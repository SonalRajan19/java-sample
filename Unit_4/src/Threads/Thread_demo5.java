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
public class Thread_demo5 {
    public static void main(String[] args){
        Thread t=Thread.currentThread();
        System.out.println(t);                  //Thread[main,5,main]
        Thread t1=new Thread("New Thread");
        System.out.println(t1);                 //Thread[New Thread,5,main]
        
        sample s=new sample();                  //Thread[Thread-0,5,main]
        //s.start();
    }
}
class sample extends Thread
{
    sample()
    {
        start();
    }
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
}