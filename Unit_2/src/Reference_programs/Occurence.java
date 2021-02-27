/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reference_programs;

/**
 *
 * @author SONAL L R
 */
public class Occurence {
    public static void main(String[] args){
        String s="have a nice day.oops.class.";
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        int count=0,sent=0;
        char search='a';
        for(char i:c)
        {
            if(i==search)
                count++;
            if(i=='.')
                sent++;
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
                search++;
        }
        System.out.println("a occured:"+count+" Times.");
        System.out.println("Sentence count:"+sent+" Times.");
    }
}
