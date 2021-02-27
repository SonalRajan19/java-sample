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
public class Single_inher {
    public static void main(String[] args){ 
        boxweight1 bw=new boxweight1(10,20,30,15); 
        System.out.println(bw.volume());     
    }
}
class box // Base Class 
{ 
    double width; 
    double height; 
    double depth; 
    double volume()    
    {       
        return width*height*depth;    
    }
}
class boxweight1 extends box  // Derived class 
{ 
    double weight; 
    boxweight1(double w,double h,double d,double dw)     
    { 
        width=w; 
        height=h; 
        depth=d;     
    } 
} 