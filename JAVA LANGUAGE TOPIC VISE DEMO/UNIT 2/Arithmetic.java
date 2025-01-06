// wap in java to find multiplication addition and substraction using menu driven program
import java.util.*;
public class Arithmetic {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,sub,mul=1,div;
        System.out.println(" enter a : ");
        int a = sc.nextInt();
        System.out.println(" enter b : ");
        int b = sc.nextInt();
        int arr[][]= new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.println(" enter arr["+i+"]["+j+"]: ");
                arr[i][j]=sc.nextInt();
            }
        }
        sub=arr[0][0];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(arr[i][j]+"\t");   
                sum+=arr[i][j];  
                mul*=arr[i][j];
                sub-=arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(sub);
        // for(int i=0;i<a;i++)
        // {
        //     for(int j=0;j<b;j++)
        //     {
        //         System.out.print(arr[i][j]+"\t");     
        //     }
        //     System.out.println();
        // }
        
    }
}
