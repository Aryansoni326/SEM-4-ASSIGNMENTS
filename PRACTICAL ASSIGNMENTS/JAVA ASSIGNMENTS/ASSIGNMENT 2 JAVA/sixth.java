// Write a Java program to create a two-dimensional array and sum all the diagonal elements
// of it.
import java.util.*;
public class sixth {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter rows : ");
        int rows = sc.nextInt();
        System.out.println(" enter cols : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println(" enter elements : ");
                arr[i][j]=(sc.nextInt());
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("\t" +arr[i][j]);
            }
            System.out.println();
        }

        // sum of diagnol elements
        int sum = 0;
        for(int i=0;i<rows;i++)
        {
           if(i<cols)
           {
                sum+= arr[i][i];
           }
        }
        System.out.println("The sum of the diagonal elements is: " + sum);
    }
   
}

