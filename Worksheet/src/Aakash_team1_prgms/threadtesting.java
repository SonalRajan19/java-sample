/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

/**
 *
 * @author Sonal L R
 */
public class threadtesting {
    public static void main (String arg[]) {
        System.out.println("enter the number of threads you want to create");   
        //Getting command line input  
        int number =Integer.parseInt(arg[0]);
        ThreadTest t[]= new ThreadTest[number];
        //thread creation loop  
        for(int a =1 ; a<=n ; a++){
            test[a] = new ThreadTest ("Thread #"+i );
            test[a].start();
        try{
        test[a].join();
    }
    catch(InterruptedException e){
       System.out.print(e);
     }

    }

   )



   }

  }

 class threadtesting1 extends Thread {
   public ThreadTest (String s) {
    super(s);
  }
 
  @Override
  public void run() {
    System.out.println("Hello I am "+ getName());
  }
}
}
