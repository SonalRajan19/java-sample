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
public class Nearest_integer {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a real number:");
        double a=obj.nextDouble();
        nint(a);
    }
    static void nint(double a)
    {
        System.out.println("Interger:"+Math.round(a));
    }
}
