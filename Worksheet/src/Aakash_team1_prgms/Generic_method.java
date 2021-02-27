/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Generic_method {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Integer list[] = {133, 452, 632, 865, 124, 675, 144};
        System.out.println("List elements are:");
        for (int i=0; i<list.length; i++)
            System.out.println(list[i]+" ");
        Generic g = new Generic();
        g.OddNUmbers(list);
        
        System.out.println("Enter the position of 1st element to be exchanged:"); 
        int position1 = input.nextInt();
        System.out.println("Enter the position of 2nd element to be exchanged:"); 
        int position2 = input.nextInt();
        if(position1>9 || position1<0 || position2>9 || position2<0) {
            System.out.println("Invalid position!");
            return;
        }
        g.ExchangePOsition(list, position1, position2);
        
        System.out.println("Enter the begin index to find the maximal element in the particular range:"); 
        int begin = input.nextInt();
        System.out.println("Enter the end index to find the maximal element in the particular range:"); 
        int end = input.nextInt();
        if(begin > end) {
            System.out.println("Invalid indices!"); 
            return;
        }
        g.MaximalElement(list, begin, end);
    }
}
class Generic {
    public<T extends Integer> void OddNUmbers(T[] value) {
        int n=0;
        for (T value1 : value) {
            if (value1 % 2 != 0) {
                n++;
            }
        }
        if(n>0)
            System.out.println("Number of odd integers are:"+n);
        else
            System.out.println("No odd integers are present in the list!");
    }
    public<T extends Integer> void ExchangePOsition(T[] value, int position1, int position2) {
        T temp; 
        temp = value[position1-1];
        value[position1-1] = value[position2-1];
        value[position2-1] = temp;
        System.out.println("list elements after exchanging are:");
        for (T value1 : value) {
            System.out.println(value1 + " ");
        }
    }
    public<T extends Integer> void MaximalElement(T[] value,int begin,int end) {
        T max = value[begin];
        for(int i=begin; i<=end; i++) {
            if(value[i] > max) {
                max = value[i];
            }
        }
        System.out.println("Maximal element is:"+max);
    }
}