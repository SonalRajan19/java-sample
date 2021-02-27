/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sonal L R
 */
public class Ticket_reservation {
    public static void main(String[] args){
        int one,two,three;
        Reservation reserve = new Reservation(); 
        
        Person thread1 = new Person(reserve);
        thread1.start();
         
        Person thread2 = new Person(reserve);
        thread2.start();
         
        Person thread3 = new Person(reserve);
        thread3.start();
    }
}
class Reservation
{
    static int availableSeats = 60;
    synchronized void reserveSeat() throws InterruptedException 
    {   
        int requestedSeats;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of seats you require");
        
        requestedSeats = obj.nextInt();
        System.out.println(Thread.currentThread().getName() + " entered.");
        System.out.println("Availableseats : " + availableSeats + " Requestedsetas : " + requestedSeats);
        if (availableSeats >= requestedSeats)
        {
            System.out.println("Seat Available. Reserve now :-)");
                Thread.sleep(100); 
            System.out.println(requestedSeats + " seats reserved.");
            availableSeats = availableSeats - requestedSeats;
        }
        else
        {
            System.out.println(" Sorry Requested seats are not available");
        }
        System.out.println("----------------------------------------------");
    }
}
class Person extends Thread
{
    Reservation reserve;
    int requestedSeats;
    public Person(Reservation reserve)
    {
        this.reserve = reserve;
    }
    @Override
    public void run() 
    {
        try {
            reserve.reserveSeat();
        } 
        catch(InterruptedException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}