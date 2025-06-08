import java.util.*;

public class WildcardDemo {

    // 1. Unbounded wildcard: accepts any type
    public static void displayUnbounded(List<?> list) {
        System.out.println(list);
    }

    // 2. Upper bounded wildcard: accepts Number or its subclasses
    public static void displayUpperBounded(List<? extends Number> list) {
        System.out.println(list);
    }

    // 3. Lower bounded wildcard: accepts Integer or its superclasses
    public static void displayLowerBounded(List<? super Integer> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        List<String> stringList = Arrays.asList("A", "B", "C");

        // --- Unbounded ---
        displayUnbounded(intList);    // OK
        displayUnbounded(doubleList); // OK
        displayUnbounded(stringList); // OK

        // --- Upper Bounded (extends Number) ---
        displayUpperBounded(intList);    // OK
        displayUpperBounded(doubleList); // OK
        // displayUpperBounded(stringList); // ❌ Error: String is not a subclass of Number

        // --- Lower Bounded (super Integer) ---
        displayLowerBounded(intList);    // OK
        // displayLowerBounded(doubleList); // ❌ Error: Double is not a superclass of Integer
        // displayLowerBounded(stringList); // ❌ Error: String is not a superclass of Integer
    }
}
