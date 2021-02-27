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
public class Bank_balance {
     public static void main(String args[]){
        bankA one=new bankA();
        bankB two=new bankB();
        bankC three=new bankC();
        one.setdata(1000);
        two.setdata(1500);
        three.setdata(2000);
        int a=one.getbalance();
        int b=two.getbalance();
        int c=three.getbalance();
        System.out.println("Balance in Bank A is:$"+ a);
        System.out.println("Balance in Bank B is:$"+ b);
        System.out.println("Balance in Bank C is:$"+ c);
    }   
}
class bank
{
    int getbalance()
    {
    return 0;
    }
}
class bankA extends bank    
{
    int balance;
    void setdata(int bal)
    {
        balance=bal;
    }
    @Override
    int getbalance()
    {
        return balance;
    }
}
class bankB extends bank
{
    int balance;
    void setdata(int bal)
    {
        balance=bal;
    }
    @Override
    int getbalance()
    {
        return balance;    
    }
}
class bankC extends bank
{
    int balance;
    void setdata(int bal)
    {
        balance=bal;
    }
    @Override
    int getbalance()
    {
        return balance;
    } 
}