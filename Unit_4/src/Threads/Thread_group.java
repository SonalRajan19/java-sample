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
public class Thread_group {
    public static void main(String[] args){
        Threadgrp obj=new Threadgrp();
        ThreadGroup th=new ThreadGroup("Parent Group");
        Thread t1=new Thread(th,obj,"one"); //Threadgrp object, obj runnable, Thread name
        Thread t2=new Thread(th,obj,"two");
        Thread t3=new Thread(th,obj,"three");
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println(th.getParent());
    }
}
class Threadgrp implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
}