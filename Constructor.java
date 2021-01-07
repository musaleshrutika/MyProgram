import java.util.*;
import java.lang.*;

class Area
{
    int r;
    int l,b;

    public Area(int r)
    {
      double areaOfcircle = (3.14 * r * r);
      System.out.println("The area of circle is.."+areaOfcircle);
    }

    public Area(int l,int b)
    {
        int areaOfrect = (l*b);
        System.out.println("The area of rect is.."+areaOfrect);
    }
}

class Constructor
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter radius");
        int radius = sobj.nextInt();

        System.out.println("Enter length and bredth");
        int length = sobj.nextInt();
        int bredth = sobj.nextInt();

        Area a = new Area(radius);
        Area b = new Area(length,bredth);

    }
}

//Notes:
//The Constructor is intiallizes the variables
//the CConstructor shouble be same as classname.
//the Constructor do not have any return type.
//We never create call the Constructor it will be automatically called when we are creating the object of a class.
