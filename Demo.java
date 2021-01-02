import java.util.*;
import java.lang.*;

class Demo
{
    public static void main(String arg[])
    {
        int iSum=0;
        int Arr[] = new int[4];
        Arr[0]=5;
        Arr[1]=6;
        Arr[2]=4;
        Arr[3]=6;
        Arr[4]=9;
        for(int i=0;i<Arr.length;i++)
        {
            iSum = iSum+Arr[i];
        }
        System.out.println("Addition is" +iSum);
    }
}