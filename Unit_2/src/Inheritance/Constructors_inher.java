/*
When Constructors Are Executed In a class hierarchy, constructors complete their 
execution in order of derivation, from superclass to subclass. If super( ) is not 
used, then the default or parameterless constructor of each superclass will be executed. 
 */
package Inheritance;

/**
 *
 * @author SONAL L R
 */
public class Constructors_inher {
    public static void main(String[] args){ 
        C1 obj=new C1();   
    } 
}
class A1
{
    A1()
    {
        System.out.println("Inside A's constructor.");
    }
}
class B1 extends A1
{ 
    B1()
    { 
        System.out.println("Inside B's constructor.");  
    } 
}
class C1 extends B1// Create another subclass by extending B. 
{
    C1()
    { 
        System.out.println("Inside C's constructor.");   
    }
} 