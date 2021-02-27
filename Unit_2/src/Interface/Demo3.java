/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Demo3 {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter product code:");
        int i=obj.nextInt();
        testint obj1=new testint();
        obj1.getproductdetails(i);
        obj1.getproductprice(i);
    }
}
interface prodcode
{
    int tv=101;
    int laptop=102;
    int mobile=103;
}
interface methoddesc
{
    void getproductdetails(int code);
    void getproductprice(int code);
}
class testint implements prodcode,methoddesc
{
    public void getproductdetails(int code)
    {
        switch(code)
        {
            case tv:
                System.out.println("Sony");
                break;
            case laptop:
                System.out.println("Acer");
                break;
            case mobile:
                System.out.println("RedMi");
                break;
        }
    }
    public void getproductprice(int code)
    {
        switch(code)
        {
            case 1:
                System.out.println("50000");
                break;
            case 2:
                System.out.println("41500");
                break;
            case 3:
                System.out.println("14000");
                break;
        }
    }
}