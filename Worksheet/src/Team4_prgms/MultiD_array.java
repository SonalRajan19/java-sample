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
public class MultiD_array {
    static int a[]=new int[20];
    static int b[][]=new int[5][5];
    static int c[][][]=new int[10][10][10];
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of 1D:");
        int n1=obj.nextInt();
        System.out.println("enter the value in array:");
        for(int i=1;i<=n1;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("**************");
        System.out.println("One Dimensional array:");
        for(int i=1;i<=n1;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("****************");
        System.out.println("Enter the no of rows  of 2D");
        int n2=obj.nextInt();
        System.out.println("enter the no of coloumns of 2D");
        int n3=obj.nextInt();
        System.out.println("Enter the elements of the two dimensional array");
        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<n3;j++)
            {
                System.out.println("enter the value");
                b[i][j]=obj.nextInt();
            }

        }
        System.out.println("****************");
        System.out.println("Two Dimensional Array:");
        for(int i=0;i<n2;i++)
        {
            System.out.println("");
            for(int j=0;j<n3;j++)
            {
                System.out.print(b[i][j]+"    ");
            }
        }
        System.out.println("");
        System.out.println("******************");
        System.out.println("Enter the requirements  of array:");
        int n4=obj.nextInt();
        int n5=obj.nextInt();
        int n6=obj.nextInt();
        System.out.println("Enter the value of 3D:");
        for(int i=0;i<n4;i++)
        {
            for(int j=0;j<n5;j++)
            {
                for(int k=0;k<n6;k++)
                {
                    c[i][j][k]=obj.nextInt();
                }
            }
        }
        for(int i=0;i<n4;i++)
        {
            for(int j=0;j<n5;j++)
            {
                System.out.println("");
            }
            for(int k=0;k<n6;k++)
            {
                System.out.print(c[i][j][k]+"     ");
            }
        }
    }
}