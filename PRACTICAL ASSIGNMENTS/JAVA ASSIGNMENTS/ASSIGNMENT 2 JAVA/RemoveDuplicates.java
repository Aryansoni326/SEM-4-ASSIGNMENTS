
// 2. Write a java Program to remove duplicate element in an Array.
import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of elemets : ");
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println(" enter " + n + " elements : ");

        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        System.out.println(" Array list is : " + A); 

        // removing duplicates
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) == (A.get(j))) {
                    A.remove(j);
                    j--; // Adjust index after removal to check the next element
                }
            }
        }
        System.out.println(" after removing duplicates : " + A);
    }
}