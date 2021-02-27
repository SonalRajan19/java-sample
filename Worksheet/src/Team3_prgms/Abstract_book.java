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
public class Abstract_book {
    public static void main(String[] args) {
        // TODO code application logic here
        Mybook obj1=new Mybook();
        obj1.setdetails();
        Mybook obj2=new Mybook();
        obj2.setdetails();
        Mybook obj3=new Mybook();
        obj3.setdetails();
        System.out.println("Total price is:"+(obj1.price+obj2.price+obj3.price));
    }   
}
abstract class book
{
    String title;
    abstract void setdetails();
    Scanner obj=new Scanner(System.in);
    String gettitle()
    {
        return title;
    }
}
class Mybook extends book
{
    String name;
    double price;

    @Override
    void setdetails() 
    {
        name=obj.next();
        System.out.println("Name:"+name);
        title=obj.next();
        System.out.println("Title:"+title);
        price=obj.nextInt();
        System.out.println("Price:"+price);
    }
}