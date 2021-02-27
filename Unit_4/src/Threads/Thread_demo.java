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
public class Thread_demo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        thread1 obj=new thread1();
        thread2 obj1=new thread2();
        obj.start(); //start() finds run method and displays the content present in it
        obj1.start();
    }
}
class thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
        }
    }
}