/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team3_prgms;

/**
 *
 * @author SONAL L R
 */
public class Divisible_by_7 {
    public static void main(String args[]) {
        System.out.println("Numbers divisible by 7 between 100 and 200:");
        for (int i=101;i<200;i++)
        {
            if (i%7==0)
                System.out.println(i);
        }
    }
}
