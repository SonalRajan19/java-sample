/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Statements;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Nested_If {
    public static void main(String[] args){
        int a,b,c;
        int max=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter A value:");
        a=obj.nextInt();
        System.out.println("Enter B value:");
        b=obj.nextInt();
        System.out.println("Enter C value:");
        c=obj.nextInt();
        if(a>b)
        {
            if(a>c)
                max=a;
            else
                max=c;
        }
        else
        {
            if(b>c)
                max=b;
            else
                max=c;
        }
        System.out.println("Maximum value is:"+max);
    }
}