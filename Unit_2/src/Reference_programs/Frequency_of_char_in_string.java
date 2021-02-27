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
public class Frequency_of_char_in_string {
    public static void main(String[] args){
        String str="have a nice day";
        int len=0,count=0;
        char c[];
        do
        {
            c=str.toCharArray();
            len=c.length;
            count=0;
            for(char i:c)
            {
                if(c[0]==i)
                    count++;
            }
            if(count!=0)
            {
                System.out.println(c[0]+"::"+count+" Times.");
            }
            str=str.replace(" "+c[0]," ");
            System.out.println(str);
        }while(len!=1);
    }
}
