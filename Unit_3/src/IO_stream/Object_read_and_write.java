/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author SONAL L R
 */
public class Object_read_and_write {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataInputStream ds=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\fruit.txt")); //write
        System.out.println("Enter number of fruits:");
        int n=Integer.parseInt(ds.readLine()); //string
        fruit f[]=new fruit[4];
        String name;
        double price;
        for(int i=0;i<n;i++)
        {
            System.out.println("Fruit name:");
            name=ds.readLine();
            System.out.println("Fruit price:");
            price=Double.parseDouble(ds.readLine()); //double
            f[i]=new fruit(name,price);
            obj.writeObject(f[i]);
        }
        obj.close();
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\Unit_3\\src\\IO_stream\\fruit.txt")); //read
        while(n>0)
        {
            System.out.println(obj1.readObject());
            n--;
        }
        obj1.close();
    }
}
class fruit implements Serializable
{
    String name;
    double price;
    fruit(String n,double p)
    {
        name=n;
        price=p;
    }
    @Override
    public String toString()
    {
        return "Fruit name:"+name+"\nFruit price:"+price;
    }
}