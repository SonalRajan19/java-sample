/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_1;

/**
 *
 * @author SONAL L R
 */
public class Unit_test {
    public static void main(String[] args) {
        pattern p=new pattern();
        p.pat();
        System.out.println();
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||i==4||j==1||j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class pattern
{   void pat()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        } 
    }
}