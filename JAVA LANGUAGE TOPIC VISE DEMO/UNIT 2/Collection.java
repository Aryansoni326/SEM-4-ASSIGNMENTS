// collection in java
import java.util.*;
class Collection
{
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        a.remove(0);// it will remove the value at index of 0
        a.remove(2);
        System.out.println(" after removing : " +a);
        a.set(0,52);// 0 is for index and other value is for value
        System.out.println(" after updating : " +a);
        
    }
}