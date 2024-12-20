import java.util.*;
class staticCode {
    public static int rollno;
    static String name;
}
class StaticKeyword
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name : ");
        staticCode.name=s.nextLine();
        System.out.println(" enter a rollno : ");
        staticCode.rollno=s.nextInt();
        System.out.println(" name is : " +staticCode.name+ "\n roll No is : " + staticCode.rollno);    
    }
    

}