import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<Integer>();
        //arrayList add method
        students.add(0);
        students.add(1);
        students.add(2);
        students.add(3);
        students.add(4);
        students.add(5);
        System.out.println(students);
        //arrayList Get method
        System.out.println("value at index 2: "+students.get(2));
        //arrayList Set method
        students.set(2,10);
        System.out.println("value at index 2 after value change: "+ students);
        // arrayList remove method
        students.remove(2);
        System.out.println("value at index 2 after value removed: "+ students);
        // arrayList all value cleared
        students.clear();
        System.out.println("All value cleared: "+ students);
        //adding values back
        System.out.println("adding values back...");

        students.add(5);
        students.add(0);
        students.add(2);
        students.add(3);
        students.add(4);
        students.add(1);
        System.out.println(students);
        Collections.sort(students);
        System.out.println("sorted arrayList: "+ students);
    }
}