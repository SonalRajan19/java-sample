/*
A software product is needed that stores and retieves infromation about automobiles.
The informatioon needed about all automobile is:
maker(String),vehicle identification number(String),bluebookvalue(float),year(integer),
passengers(integer).
Derive a classs car from automobile with the following fields:
warranty-boolean,doors-int,imported-boolean,topspeed-integer,size-string,rear door-string.
Derive a class truck which has the following fields :
Topper-boolean,wheels-string,racks-integer.
The product have to display all the information about all vehicles.
 */
package unit_2;

/**
 *
 * @author SONAL L R
 */
public class Automobile {
    public static void main(String[] args){
        car obj=new car();
        System.out.println(obj);
        truck obj1=new truck();
        System.out.println(obj1);
    }
}    
class automobile
{
    String maker;
    String vehicleidentificationnumber;
    float bluebookvalue;
    int year;
    int passengers;
}
class car extends automobile
{
    boolean warranty;
    int doors;
    boolean imported;
    int tospeed;
    String size;
    String reardoor;
    car(String m,String v,float b,int y,int p,boolean w,int d,boolean i,int t,String n,String rd);
    {
        maker=m;
        vehicleidentificationnumber=v;
        year=y;
        passengers=p;
        warranty=w;
        doors=d;
        imported=i;
        tospeed=t;
        size=s;
        reardoor=rd;
    }
    public String tostring()
    {
        return maker;
    }
}
class truck extends automobile
{
    boolean topper;
    String wheels;
    int racks;
    truck(String m,String v,float b,int y,int p,boolean w,int d,boolean i,int t,String n,String rd,boolean tp,String wh,int r)
    {
        
    }
    public String tostring()
    {
        maker=m;
        vehicleidentificationnumber=v;
        year=y;
        passengers=p;
        warranty=w;
        doors=d;
        imported=i;
        tospeed=t;
        size=s;
        reardoor=r;
        topper=tp;
        wheels=wh;
        racks=r;
    }
} 