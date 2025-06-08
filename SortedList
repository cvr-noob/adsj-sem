import java.util.ArrayList;
import java.util.List;

public class SortedList<T extends Comparable<T>> {
    private List<T> list;

    public SortedList() {
        list = new ArrayList<>();
    }

    // Add an element in sorted order
    public void add(T element) {
        int idx = 0;
        while (idx < list.size() && list.get(idx).compareTo(element) < 0)
            idx++;
        list.add(idx, element);
    }

    // Remove element
    public boolean remove(T element) {
        return list.remove(element);
    }

    // Get element at index
    public T get(int index) {
        return list.get(index);
    }

    // Get size of the list
    public int size() {
        return list.size();
    }

    // Check if list is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
