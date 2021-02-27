/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team3_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Boolean_func {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        boolean a[]=new boolean[3];
        int i;
        System.out.println("Enter 3 boolean values: ");
        for(i=0;i<3;i++)
        {
            a[i]=obj.nextBoolean();
        }
        System.out.println("Value is:"+check(a));
    }
    static boolean check(boolean a[])
    {
        int i,flag=0;
        for(i=0;i<3;i++){
        if(a[i]==true)
        {
            flag++;
        }
    }
    if(flag>=2)
    {
        return true;
    }
    else 
    {
        return false;
    }
}
}