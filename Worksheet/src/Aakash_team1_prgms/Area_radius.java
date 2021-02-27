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

public class Area_radius {
    public static void main(String args[]){
        System.out.println("Area of a rectangle is:");
        rectangle obj2=new rectangle(4,5);
        System.out.println(obj2.resize());
        System.out.println("Radius of the cicle is:");
        circle obj1=new circle(2);
        System.out.println(obj1.resize());
    }
}  
interface resizable
{
    public int resize();    
}
interface resizablecircle
{
    public int resize();
}
class rectangle implements resizable
{
    int len;
    int breadth;
    public rectangle(int a,int b)
    {
        len=a+5;    //9
        breadth=b+5;//10
    }
    @Override
    public int resize() 
    {
        return len*breadth;//90
    }
}
class circle implements resizablecircle
{
    int radi;
    public circle(int a)
    {
        radi=a+5;   //7
    }
    @Override
    public int resize()
    {
        return radi*radi;//49
    }
}