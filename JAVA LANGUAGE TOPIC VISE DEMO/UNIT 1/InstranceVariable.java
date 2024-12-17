import java.util.*;
// instance variable also known as a class variable when u declare a variable in one class and 
// initialoize it in another class
class marks
{
    int englishMarks,mathsMarks;
    float totalMarks;
}
public class InstranceVariable {
    public static void main(String args[])
    {
        marks M = new marks();
        M.englishMarks = 20;
        M.mathsMarks = 50;
        M.totalMarks = M.englishMarks + M.mathsMarks;
        System.out.println(" the total marks is : " +M.totalMarks);

        marks M1 = new marks();
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a english marks : ");
        M1.englishMarks = sc.nextInt();
        System.out.println(" enter a maths marks : ");
        M1.mathsMarks = sc.nextInt();
        M1.totalMarks = M1.englishMarks + M1.mathsMarks;
        System.out.println(" the total marks is : " +M1.totalMarks);


    }
}
