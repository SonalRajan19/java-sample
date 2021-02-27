/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team3_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Harmonic {
	public static void main(String[] args) 
	{
            int n,i;
            double sum=0,x;
            Scanner s=new Scanner(System.in);	 
            System.out.println("enter n value");
            n=s.nextInt();
            System.out.println("Harmonic value is");
            for(i=1;i<=n;i++)
            {	  
		x=(double)1/i;
		System.out.println(" "+x);
		sum=sum+x;		  
            }
            System.out.println("output is"+sum);
            s.close();
	}	
}
