/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aakash_team1_prgms;

/**
 *
 * @author SONAL L R
 */
public class Student_sport {
    public static void main(String srgs[]){
        Result one = new Result();
        Result three = new Result();
        Result two = new Result();
        one.setdata("Aakash","19CSE096",98,100,99,9);
        two.setdata("Vasanth","19cse128",78,56,1,2);
        three.setdata("Pandi","19cse78",89,98,23,10);
        one.printresult();
        two.printresult();
        three.printresult();
    }
}
class student
{
    String name;
    String rollno;
    int maths;
    int english;
    int science;
    int sport;
    void setdata(String n,String r,int m,int eng,int sc,int s )
    {
        name = n;
        rollno = r;
        maths = m;
        english = eng;
        science = sc;
        sport = s;
    }
}
class Result extends student
{
    int sum;
    void printresult()
    {
        System.out.println("Your total mark is:"+super.maths+super.english+super.science);
        sum =super.maths+super.english+super.science;
        if(super.sport<5)
        {
            System.out.println("You failed.");
        }
        else 
        {
            System.out.println("You passed.");
        }
    }    
}
class sports extends student
{
    void printsport()
    {
        System.out.println(super.sport);
    }
}