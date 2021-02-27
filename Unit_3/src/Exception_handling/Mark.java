/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_handling;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Mark {
    public static void main(String[] args){
        Mark obj=new Mark();
        try
        {
            obj.checkMark();
        }
        catch(MarkException s)
        {
            System.out.println(s.getMessage());
        }
    }
    static void checkMark() throws MarkException
    {
        Scanner obj=new Scanner(System.in);
        int s=obj.nextInt();
        System.out.println("Enter the mark.");
        if(s<0 || s>100)
        {
            throw new MarkException("Invalid Mark.");
        }
    }
}
class MarkException extends Exception
{
    MarkException(String message)
    {
        super(message);
    }
}