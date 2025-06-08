import java.util.*;

public class TypeParamsDemo {

    // Unbounded type parameter: accepts any type of List
    public static <T> void displayUnbounded(List<T> list) {
        System.out.println(list);
    }

    // Bounded type parameter: only accepts List of Number or its subclasses
    public static <T extends Number> void displayBounded(List<T> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        List<String> stringList = Arrays.asList("A", "B", "C");

        // Calling displayUnbounded with all types
        displayUnbounded(intList);     // OK
        displayUnbounded(doubleList);  // OK
        displayUnbounded(stringList);  // OK

        // Calling displayBounded with numeric types
        displayBounded(intList);       // OK
        displayBounded(doubleList);    // OK
        // displayBounded(stringList); // ❌ Compile-time error: String is not a subclass of Number
    }
}
