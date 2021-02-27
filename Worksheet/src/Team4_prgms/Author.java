/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team4_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Author {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name,email;
        char gender;
        System.out.println("Enter the name:");
        name=obj.next();
        System.out.print("Enter the email:");
        System.out.print(email=obj.next()+"@gmail.com");
        System.out.println("");
        System.out.println("Enter the Gender(m/f):");
        gender=obj.next().charAt(0);
        author a1=new author(name,email,gender);
        a1.getname();
        a1.getmail();
        a1.crtmail();
        a1.gender();
        System.out.println(a1.tostring());
    }
}
class author
{
    Scanner obj=new Scanner(System.in);
    String name,email,setmail;
    char gender;
    author(String i,String o,char s)
    {
        name=i;
        email=o;
        gender=s;
    }
    String getname()
    {
        return name;
    }
    String getmail()
    {
        return email;
    }
    String crtmail()
    {
        System.out.print("Enter mail to correct mail:");
        System.out.print(crtmail=obj.next()+"@gmail.com");
        System.out.println("");
        email=crtmail;
        return email;
    }
    char gender()
    {
        return gender;
    }
    String tostring()
    {
        return ("name:"+name+"\n"+"email:"+email+"\n"+"Gender:"+gender);
    }
}