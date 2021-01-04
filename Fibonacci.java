import java.util.*;

class Fibonacci
{
    public static void main(String arg[])
    {
        int a = 0;
        int b = 1;
        int i,c;
        c = a+b; 

        System.out.println("Enter the number from user..");
        Scanner sobj = new Scanner(System.in);
         int num = sobj.nextInt();

        for(i=2;i<=num;i++)
        {
            b++;
            c=c+b;

        }

        System.out.println(c);
    }
}
