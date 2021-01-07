//Method OverLoading
import java.util.*;

class Demo
{
  //  int r;
  //  int l,b;

public void area(int rad)
{
   // int rad = 10;
    System.out.println("the value of radius is:"+rad);
}

public void area(int l,int b)
{
    //int l = 2;
    //int b = 3;
    System.out.println("the value of l and b are:" +l+ "and" +b);
}
}

class MethodOverloading
{
    public static void main(String arg[])
    {
       Demo dobj = new Demo();
       dobj.area(5);
       dobj.area(2,3);
    }
}

Notes:
/*Here we are dioing method overloading in the same class but with the same name but different parameters.
the method will going to call by creating object of class and we are providing the parameters on that basic the particular method will going to execute.*/
