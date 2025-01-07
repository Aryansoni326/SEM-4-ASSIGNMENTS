
// wap java program to perform following task using arraylist of integer values 
// 1. create array list add 5 integers (user input)
// 2. display the content of array list
// 3. update the array list 3rd element with a new value enterd y user
// 4. remove the element at index 1
// 5. display the updated arraylist 
// 6. print the of the arraylist
import java.util.*;
import java.util.Collection;
class Collection1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(" enter five values : ");
        for (int i = 1; i <= 5; i++) {
            a.add(sc.nextInt());
        }
        // displaying five values
        System.out.println(a);

        // update value at index 3
        System.out.println(" enter a value to be update at index 3 : ");
        a.set(3, sc.nextInt());
        // printing the updated value
        System.out.println(" updated value is : " + a);

        // removing the value at the index 2
        a.remove(2);
        // printing after removing
        System.out.println(" after removing index 2 : " + a);

        // printing the size of array
        System.out.println(" size of array : " + a.size());

        // printing the value which index value is required
        System.out.println(" the third index value is : " +a.indexOf(2));

        // adding values in arraylist 
        System.out.println(" enter a number you want to add : ");

        a.add(1,sc.nextInt());
        // after adding
        System.out.println(" after add a value the result is : " +a);


        // sorting the arraylist
        Collections.sort(a);
        System.out.println(" after sorting array list is : " +a);

        
        
        // checking that elements enter by user is available in arraylist or not
        System.out.println(" enter which element you want to check : ");
        System.out.println(a.contains(sc.nextInt()));
        if(a.contains(sc.nextInt()))

        {
            System.out.println(" elements is available in arraylist!");
        }
        else
        {
            System.out.println(" elements is not available in arraylist!");
        }

        // clearing the arraylist
        a.clear();
        System.out.println(a);
        System.out.println(" arrya list cleared!");

        // checking the arraylist is empty or not
        a.isEmpty();
        System.out.println(" array list is empty bro!");



    }
}
// index Of
// contains(element) will check arrya list me wo element he or not
// clear(element) will clear arraylist
// isEmpty
// add(index,element)
// sort(arraylist)
