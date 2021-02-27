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
public class Serach_element {
    public static void main(String[] args) {
        int i,n,search,arr[];
        System.out.println("Enter the size of array:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        arr=new int[n];
        System.out.println("Enter the number in array:");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter the number to Search:");
        search=obj.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("The number "+search+" is found at:"+i+1);
                break;
            }
        }
        if(i==n)
        {
            System.out.println(search+" isn't present in array.");
        }
    }
}