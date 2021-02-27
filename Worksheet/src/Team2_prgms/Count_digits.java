/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team2_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Count_digits {
    public static void main(String[] args) {
        int count=0;
        Scanner t=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=t.nextInt();
        while(no>0)
        {
            no=no/10;
            count=count+1;
        }
        System.out.println("no. of digits:"+count);
    }
}
