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
public class Jagged_array {
    public static void main(String[] args){
    //jagged array
    // 1 2 3 4
    // 5 6
    // 7 8 9
    // 1 2 3 4 5
    int c[][]=new int[][]{{1,2,3,4},{5,6},{7,8,9},{1,2,3,4,5}};
    for(int i=0;i<c.length;i++) //no of rows
    {
        for(int j=0;j<c[i].length;j++) // row length
        {
            System.out.print(c[i][j]+"\t");
        }
        System.out.println();
    }
    for(int i[]:c)
    {
        for(int j: i)
        {
            System.out.print(j+"\t");
        }
        System.out.println();
    }
}
}
