/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author SONAL L R
 */
public class Array {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[3]; // declare + memory allocation(instantiate)
        a[0]=1; // initialization
        a[1]=3;
        a[2]=4;
        /*for(int i=0;i<3;i++)
        {
            a[i]=i+1; // initialization
            System.out.println(a[i]);
        }*/
        for(int i:a)
        {
            System.out.println(i);
        }
        int a1[]={1,2,3}; //declare + memory alloc + initial
        int a2[]=new int[]{1,2,3}; //declare + memory alloc+ initial
        int []a3;
        int[] a4;
        int [][]b4=new int[2][3];
        int[][] b2;
        int []b3[];
        b4[0][0]=2;
    }
}