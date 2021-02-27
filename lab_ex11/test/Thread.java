
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sonal L R
 */
public class Thread {
    public static void main(String[] args){
        // TODO code application logic here
        Numbers n=new Numbers();
        GetNumbersThread t1=new GetNumbersThread(n);
        GetNumbersDivisibleBy5Thread t2=new GetNumbersDivisibleBy5Thread(n);
        GetAverageOfNumbersThread t3=new GetAverageOfNumbersThread(n);

        t1.start();
        try
        {
            t1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        t2.start();
        try
        {
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        t3.start();
    }
}
class GetNumbersThread extends java.lang.Thread
{
    Numbers task;
    GetNumbersThread(Numbers task)
    {
        this.task=task;
    }
    public void run()
    {
        super.run();
        task.getNInputs();
    }
}
class GetNumbersDivisibleBy5Thread extends java.lang.Thread
{
    Numbers task;
    GetNumbersDivisibleBy5Thread(Numbers task)
    {
        this.task=task;
    }
    public void run() 
    {
        super.run();
        //System.out.println("\n-----------------------");
        System.out.println("\nPrinting all numbers divisible by 5:");
        ArrayList<Integer> res=task.getNumbersDivisibleBy5();
        for(int number:res)
        {
            System.out.print(number+" ");
        }
    }
}
class GetAverageOfNumbersThread extends java.lang.Thread
{
    Numbers task;
    GetAverageOfNumbersThread(Numbers task)
    {
        this.task=task;
    }
    public void run() 
    {
        super.run();
        //System.out.println("\n-----------------------");
        System.out.print("\nPrinting the average:");
        System.out.println(task.getAverageOfAllNumbers());
        //System.out.println("-----------------------");
    }
}
class Numbers
{
    ArrayList<Integer> numbers;
    Numbers()
    {
        numbers=new ArrayList<>();
    }
    void getNInputs()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter value for N: ");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the number for index "+i+": ");
            numbers.add(obj.nextInt());
        }
        //System.out.println("-----------------------");
        System.out.print("Entered numbers are:");
        for(int number:numbers)
        {
            System.out.print(number+" ");
        }
    }
    ArrayList<Integer> getNumbersDivisibleBy5()
    {
        ArrayList<Integer> result=new ArrayList<>();
        //Enhanced for loop
        for(int number:numbers)
        {
            if(number%5==0)
            {
                result.add(number);
            }
        }
        return result;
    }
    int getAverageOfAllNumbers()
    {
        int avg=0;
        for(int number:numbers)
        {
            avg+=number;
        }
        avg/=numbers.size();
        return avg;
    }
}