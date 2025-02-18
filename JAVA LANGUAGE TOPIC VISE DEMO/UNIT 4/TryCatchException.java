import java.util.*;
class DivideClass
{
    float Divide(int a,int b)
    {
        return a/b;
    }
}
public class TryCatchException {
    public static void main(String args[])
    {
        DivideClass d = new DivideClass();
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a : ");
        int a = sc.nextInt();
        System.out.println(" enter b : ");
        int b = sc.nextInt();
        
        try
        {
            System.out.println(d.Divide(a,b));
        }
        catch(ArithmeticException e)
        {
            System.out.println(" Devide by Zero Error!");
        }
    }
}
