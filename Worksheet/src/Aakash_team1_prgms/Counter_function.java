/*
Write a program for performing counter function using static and non static variable.

 */
package Aakash_team1_prgms;

/**
 *
 * @author Sonal L R
 */
public class Counter_function {
public static void main(String[] args) {
System.out.println("counter function using non static :");
counter c1=new counter();
counter c2=new counter();
counter c3=new counter();
System.out.println("counter function using static :");
counter2 c4=new counter2();
counter2 c5=new counter2();
counter2 c6=new counter2();
// TODO code application logic here
}
}    
class counter {
int count=0;
counter(){
count++;
System.out.println(count);
}
}
class counter2 {
static int count=0;
counter2(){
count++;
System.out.println(count);
}
}