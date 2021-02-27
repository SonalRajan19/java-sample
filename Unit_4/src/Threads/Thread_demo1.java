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
public class Thread_demo1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        thread1 obj=new thread1();
        thread2 obj1=new thread2();
        obj.start(); 
        obj1.start();
    }
}
class thread3 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try
            {
                Thread.sleep(500); //millisecond
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class thread4 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(500); 
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}