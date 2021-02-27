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
public class Thread_demo4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        //Using Runnable interface
        test obj=new test();
        Thread t=new Thread(obj);
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
class test implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hey");
        }
    }
}