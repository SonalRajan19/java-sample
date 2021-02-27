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
public class Daemon_thread extends Thread{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
            System.out.println("Daemon thread works.");
        else
            System.out.println("User thread works.");
    }
    public static void main(String[] args){
        Daemon_thread t1=new Daemon_thread();
        Daemon_thread t2=new Daemon_thread();
        Daemon_thread t3=new Daemon_thread();
        
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }     
}