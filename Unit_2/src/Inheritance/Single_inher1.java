/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author SONAL L R
 */
public class Single_inher1 {
    public static void main(String[] args){
        boxweight2 bx=new boxweight2(10,20,30,40);
        System.out.println(bx.volume());
        System.out.println(bx.weight);
    }
}
class box2  //super
{
    double height,width,depth;
    double volume()
    {
        return height*width*depth;
    }
}
class boxweight2 extends box2  //sub
{
    double weight;
    boxweight2(double h,double w,double d,double w1)
    {
        height=h;
        width=w;
        depth=d;
        weight=w1;
    }
}
class boxcost1 extends boxweight2 //box+boxweight+boxcost
{
    double cost;
    boxcost1(double h,double w,double d,double w1,double c)
    {
        height=h;
        width=w;
        depth=d;
        weight=w1;
        cost=c;
    }
}