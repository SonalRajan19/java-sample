/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Team3_prgms;

/**
 *
 * @author SONAL L R
 */
public class Rectangle {
    public static void main(String[] args) 
	{
            rect ob=new rect(1,1);
            System.out.println("length is:"+ob.getlength());
            System.out.println("width is:"+ob.getwidth());		
            System.out.println("area is:"+ob.getarea());
            System.out.println("perimeter is:"+ob.getperimeter());
            ob.setlength(2);
            ob.setwidth(2);
            System.out.println("Displaced length is:"+ob.tostring());
            System.out.println("Displaced area is:"+ob.getarea());
            System.out.println("Displaced perimeter is:"+ob.getperimeter());	
	}
}
class rect
{
    float length,width;
    rect()
    {
		
    }	
    rect(float l,float w)
    {
	length=l;
	width=w;
    }
    float getlength()
    {
	return length;
    }
    float getwidth()
    {
        return width;
    }
    void setlength(float l)
    {
	length=l;	
    }
    void setwidth(float w)
    {
    	width=w;	
    }
    double getarea()
    {
	return length*width;	
    }
    double getperimeter()
    {
	return 2*(length*width);	
    }
    public String tostring()
    {
	  return length+"\nDisplaced width is:"+width;
    }
}