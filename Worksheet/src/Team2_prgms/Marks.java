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
public class Marks {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        int w=1,e=0;
        System.out.println("Enter marks:");
        int a=q.nextInt();
        switch(a)
        {
            case 10:
                System.out.println("excellant");
                break;
            case 9&8:
                System.out.println("very good");
                break;
            case 7&6:
                System.out.println("good");
                break;
            case 5&4&3:
                System.out.println("poor");
                break;
            case 2:
                System.out.println("very poor");
                break;
            default:
                System.out.println("very poor");       
        }
    }
}
