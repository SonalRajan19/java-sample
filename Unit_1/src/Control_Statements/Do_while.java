/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Statements;

/**
 *
 * @author SONAL L R
 */
public class Do_while {
    public static void main(String[] args){
        int m=1; 
        do 
        { 
            System.out.println(m); 
            m=m+1; 
        }
        while(m==20);
    }
}
class dowhile1 
{ 
    public static void main(String args[]){ 
        int i=1; 
        int sum=0; 
        do 
        { 
            sum=sum+i; 
            i++; 
        }while(i<=10); 
        System.out.println("The sum of 1 to 10 is:"+sum); 
    } 
}