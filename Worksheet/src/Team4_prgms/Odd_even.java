/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team4_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Odd_even {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i,n,arr[];System.out.println("Enter the size of array:");
        n=obj.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements in array:");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Odd Numbers:");
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}