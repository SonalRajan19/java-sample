/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_1;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Demo1 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Press Key");
        int a=obj.nextInt();
        switch(a)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("U pressed...."+a);
                break;
            default:
                System.out.println("U pressed incorrect option..."+a);
        }

    }
}