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
public class Jagged_array1 {
     public static void main(String[] args){ 
        //int a[][] = new int[3][4];
        int a[][] ={{2,3,6,7},{3,5,9},{4,8,9,2,8}}; 
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i[]: a)
        {
            for(int j : i)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }  
}
