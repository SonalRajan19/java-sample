/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team7_prgms;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class lab12_prgm2 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        Integer[] arr1={10,29,38,47,56};
        Character[] arr2={'a','r','y'};
        String[] arr3={"priya","ashwin","sneha","murugan","hema"};
        Double[] arr4={10.4,4.35,6.55,9.8};
        System.out.println("enter the integer to be searched");
        int n1=obj.nextInt();
        search(arr1,n1);
        System.out.println("----------------------------------");
        System.out.println("enter the Character to be searched");
        char n2=obj.next().charAt(0);
        search(arr2,n2);
        System.out.println("----------------------------------");
        System.out.println("enter the String to be searched");
        String n3=obj.next();
        search(arr3,n3);
        System.out.println("----------------------------------");
        System.out.println("enter the double to be searched");
        double n4=obj.nextDouble();
        search(arr4,n4);
    }
    public static <t,n>void search(t[] arr, n val)
    {
        int flag=0;
        int pos=0;
        for(int i=0;i<arr.length;i++)
        {
            if(val.equals(arr[i]))
            {
                flag++;
                pos=i;
            }
        }
        if(flag==0)
        {
            System.out.println("element not found");
        }
        else
        {
            System.out.println("element is found at position "+pos);
        }
    }
}