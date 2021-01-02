import java.util.*;

class Memo
{
    public static void main(String arg[])
    {
        int arr[] = new int[10];
        Scanner sobj = new Scanner(System.in);
         System.out.println("Enter the size of the array");
           int size = sobj.nextInt();
        try
        { 
            
            System.out.println("Enter array elements");

           for(int i=0;i<size;i++)
             {
                 arr[i]=sobj.nextInt();
             }
        }

           catch(IndexOutOfBoundsException e)
        {  System.out.println("Array index is out of bound"); }

        finally
        { 
        System.out.println("Print the array elements....");
           for(int i=0;i<size;i++)
             {
                System.out.println(arr[i]);
              }
        }
    }
    
        
        
}
//Notes:
// We should declare all the necessary variables outside the try block so that we can use it inside the class anywhere.
//the finally block will always execute.
//here in this code we are handling the exception so that our code will continue its execution without taking a pause.
//the main class is throwable and hierarchy of the throwable class is there in the exception in java
//throwable- 1) Exception-1)Cheaked Exception 2)Uncheaked Exception
             //2) Error:- Runtime errors
//Cheaked exception are those which we can handle at compile time.
//Uncheaked exception are those which we can handle at runtime.   
//we can use here in this code try without catch but with the finally.          


