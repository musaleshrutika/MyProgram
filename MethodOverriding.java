import java.util.*;

class A
{
   public void show()
   {
       System.out.println("I am in A");
   } 
}

class B extends A
{
    public void show()
    {
        super.show(); // here we are using it to access the method of super class.
        System.out.println("I am in B");
    }
}

class MethodOverriding
{
    public static void main(String arg[])
    {
        B b = new B();
        b.show();
    
    }
}

/*Notes: here we are performing method Overriding .
so are require two classes to perform overriding.
so we are extending super class(parent class)(base) into sub class(child class)(derived);
so we are creating object of sub class and we calling the method of sub class.
so same name and same signature of method is there in the both classes So the method of 1st class will be override on 2nd class so we will get the output of
only sub class but if we want the method of super class to call then we can use "Super Keyword" in that case.*/