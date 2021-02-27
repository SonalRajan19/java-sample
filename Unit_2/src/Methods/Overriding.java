/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author SONAL L R
 */
public class Overriding {
    public static void main(String[] args){
        sbi s=new sbi();
        System.out.println(s.getrateofinterest());
        iob i=new iob();
        System.out.println(i.getrateofinterest());
        kvb k=new kvb();
        System.out.println(k.getrateofinterest());
        
        bank b; //reference //dynamic method invocation
        b=new sbi();    //memeory is created
        System.out.println(b.getrateofinterest());
        b=new iob();
        System.out.println(b.getrateofinterest());
        b=new kvb();
        System.out.println(b.getrateofinterest());
    }
}
class bank  //super
{
    int getrateofinterest()
    {
        return 0;
    }
}
class sbi extends bank
{
    @Override
    int getrateofinterest()
    {
        return 8;
    }
}
class iob extends bank
{
    @Override
    int getrateofinterest()
    {
        return 7;
    }
}
class kvb extends bank
{
    int getrateofinterest()
    {
        return 6;
    }
}