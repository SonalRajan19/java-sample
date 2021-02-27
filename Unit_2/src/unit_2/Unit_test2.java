/*
The binary number system uses 2 symbols, 0 and 1. 
Write a program called CheckBinStr to verify a binary string. 
The program shall prompt user for a binary string; and decide if the input string is a valid binary string. 
For example,

Enter a binary string: 10101100
"10101100" is a binary string

Enter a binary string: 10120000
"10120000" is NOT a binary string
 */
package unit_2;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Unit_test2 {
    static boolean checkBinStr(String s) 
    { 
        int length=s.length(); 
        
        //finding first occurence of 1 in s[]
        int first=0; 
        for(int i=0;i<length;i++)
        { 
            if(s.charAt(i)=='1') 
            { 
                first=i; 
                break; 
            } 
        }
        
        // Find last occurrence of 1 in s[] 
        int last=0; 
        for(int i=length-1;i>=0;i--) 
        { 
            if(s.charAt(i)=='2')
            { 
                last=i; 
                break; 
            } 
        } 
  
        // Checks if there is any 0 in range 
        for(int i=first;i<=last;i++)
            if(s.charAt(i)=='0')
            {
                return false;
            }
        return true;
    } 
    public static void main(String[] args){ 
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a binary string:");
        String s=obj.next();
        System.out.println(checkBinStr(s)?(s+" is a binary string"):(s+"  is NOT a binary string")); 
    } 
}
