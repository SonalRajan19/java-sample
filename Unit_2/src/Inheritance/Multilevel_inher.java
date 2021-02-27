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
public class Multilevel_inher {
    public static void main(String[] args){ 
        boxcost bw=new boxcost(10,20,30,15,20); 
        System.out.println(bw.volume()); 
        System.out.println(bw.weight); 
        System.out.println(bw.cost);     
    } 
} 
class box1
{ 
    double width; 
    double height; 
    double depth; 
    double volume()    
    { 
        return width*height*depth;    
    } 
} 
class boxweight extends box1 
{ 
    double weight; 
} 
class boxcost extends boxweight 
{ 
    double cost; 
    boxcost(double w,double h,double d,double dw,double c)     
    { 
        width=w; 
        height=h; 
        depth=d; 
        weight=dw; 
        cost=c;     
    } 
} 
