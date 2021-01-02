import java.util.*;

class SumOfArray
{
    public static void main(String arg[])
    {
        int arr[][] = new int[3][3];
        int brr[][] = new int[3][3];
        int i=0;
        int j=0;
        int sum[][]= new int[3][3];
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements for 1st matrix...");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("print the eleents of 1st matrix...");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }

            System.out.println();
        }

        System.out.println("Enter the elements for 2nd matrix...");
        for(i=0;i<brr.length;i++)
        {
            for(j=0;j<brr.length;j++)
            {
                brr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("print the elements of 2nd matrix...");
        for(i=0;i<brr.length;i++)
        {
            for(j=0;j<brr.length;j++)
            {
                System.out.print(brr[i][j]+"\t");
            }

            System.out.println();
        }

        System.out.println("Add the elements of 2 matrices..");
         for(i=0;i<sum.length;i++)
         {
             for(j=0;j<sum.length;j++)
             {
                 sum[i][j] = arr[i][j]+brr[i][j];
             }
         }

         System.out.println("The Resultant matrix is....");
         for(i=0;i<arr.length;i++)
         {
             for(j=0;j<arr.length;j++)
             {
                 System.out.print(sum[i][j]+"\t");
             }
             System.out.println();
         }
    }
}
