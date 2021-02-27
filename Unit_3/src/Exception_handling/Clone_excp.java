/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_handling;

/**
 *
 * @author SONAL L R
 */
public class Clone_excp {
    public static void main(String args[]){
        
    }
}
class department implements Cloneable
{
    String dept_name;
    String desg;
    department(String n,String d)
    {
        dept_name=n;
        desg=d;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class employee implements Cloneable
{
    int emp_id;
    String emp_name;
    department d;
    employee(int e,String n,department d1)
    {
        emp_id=e;
        emp_name=n;
        d=d1;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}