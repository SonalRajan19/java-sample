/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Author_book {
    public static void main(String args[]){
        System.out.println("Enter the author details:");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of the author:");
        String author_name;
        author_name=input.next();
        System.out.println("Enter the email id:");
        String email_id;
        email_id=input.next();
        System.out.println("Enter the gender:");
        String gender;
        gender=input.next();
        String bookname;
        Double price;
        Double Quantity;
        Author one=new Author(author_name,email_id,gender);
        System.out.println("Author:"+one.getname());
        System.out.println("Email:"+one.getemail());
        System.out.println("Gender:"+one.getgender());
        System.out.println("Enter the book name:");
        bookname=input.next();
        System.out.println("Enter the price of the book:");
        price=input.nextDouble();
        System.out.println("Enter the quantity of the books:");
        Quantity=input.nextDouble();
        String authorName=one.names;
        Book two=new Book(bookname,authorName,price,Quantity);
        System.out.println("Bookname:"+two.getName());
        System.out.println("Auhtorname:"+authorName);
        System.out.println("Price:"+two.getPrice());
        System.out.println("quantity:"+two.getQuantity());
    }
}
class Author
{
    String names;
    String emails;
    String genders;
        Author(String name,String email,String gender)
        {
            this.names=name;
            this.emails=email;
            this.genders=gender;
        }
        String getname()
        {
            return names;
        }
        String getemail()
        {
            return emails;
        }
        String getgender()
        {
            return genders;
        }
}
class Book
{
    String names;
    String authorName;
    Double price;
    Double quantity;
    Book(String n,String an,Double p,Double q)
    {
        this.names=n;
        this.authorName=an;
        this.price=p;
        this.quantity=q;
    }
    String getName()
    {
        return names;
    }
    String getAuthor()
    {
        return authorName;
    }
    Double getPrice()
    {
        return price;
    }
    Double getQuantity()
    {
        return quantity;
    }
}