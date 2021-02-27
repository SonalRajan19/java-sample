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
public class Thread_demo3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic here
        thread1 obj=new thread1();
        thread2 obj1=new thread2();
        obj.start(); 
        obj.join();
        obj1.start();
        
        //System.out.println(obj.isAlive()); //true
        
        /*int i=90/0;
        System.out.println(i); //Exception in thread "main" java.lang.ArithmeticException: / by zero*/
        
        /*obj.setName("Hi thread");
        obj1.setName("Hello thread");
        System.out.println(obj.getName()); //Hi thread
        System.out.println(obj1.getName()); //Hello thread*/
        /*System.out.println(obj.getName()); //Thread-0
        System.out.println(obj1.getName()); //Thread-1*/
        
        /*System.out.println("ID 1:"+obj.getId());
        System.out.println("ID 2:"+obj1.getId());*/
        
        /*Priority number
        ->ranges from 1-10
        ->lowest=1 and highest=10
        ->highets priority thread executes first
        ->intermediate numbers
        ->5:default number*/
        
        /*obj.setPriority(10);
        System.out.println("Priority for t1:"+obj.getPriority()); //5
        System.out.println("Priority for t2:"+obj1.getPriority()); //5*/
        
        //obj.join();
        obj1.join();
        //System.out.println(obj.isAlive()); //false
        System.out.println("Finished");
    }
}
class thread7 extends Thread
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
class thread8 extends Thread
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