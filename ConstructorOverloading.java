import java.util.*;

class A
{
    public A()
    {
        System.out.println("I am default");
    }

    public A(int i)
    {
        System.out.println("I am single parameterized..");
    }

    public A(int i,int j)
    {
        
        System.out.println("I am double parameterized..");
    }
}

class ConstructorOverloading
{
    public static void main(String arg[])
    {
        A a = new A(5,7);
    }
}

/*/Notes: here we are performing constructor Overloading 
So in the same class we are performing the constructor overlaoding with the same name and diffrent parameters.

We cannot use here the "super keyWord".*/