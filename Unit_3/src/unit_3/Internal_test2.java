/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit_3;

/**
 *
 * @author Sonal L R
 */
public class Internal_test2 {
     public static void main(String[] args){
            int c;
            try
            {
                //two integers as command line arguments
                int a=Integer.parseInt(args[0]); 
                int b=Integer.parseInt(args[1]);
                if(a<0 || b<0) //checking the condition for positive integers
                {
                    throw new exp("Number should be positive, but your input is Negative."); //user defined exception
                }
                if(a>b) //checking the condition for second value to be lesser than first value
                {
                    throw new exp("Second value should be greater, but your input is Lesser."); //user defined exception
                }
                for(int j=a;j<=b;j++)
                {
                    c=0;
                    if(j==1)
                    {
                        c=c+1;
                    }
                    for(int i=2;i<j;i++)
                    {
                        if(j%i==0)
                        {
                            c=c+1;
                        }

                    }
                    if(c==0)
                    {
                        System.out.println(j);
                    }
                    a++;
                }
            }
            catch(exp e) //to handle error
            {
                System.out.println(e);
            }  
        }
}
class exp extends Exception //to identify it is user defined exception
{
    String s;
    exp(String s1)
    {
        s=s1;
    }
    public String toString() //to return the value
    {
        return s;
    }
}