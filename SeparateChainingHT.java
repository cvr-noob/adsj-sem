import java.util.*;

public class SeparateChainingHT {
    private final int SIZE = 10;
    private LinkedList<Integer>[] table; // Hash Table as an array of LinkedLists

    SeparateChainingHT() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++)
            table[i] = new LinkedList<>();
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void insert(int key) {
        int idx = hash(key);
        table[idx].add(key); // Add element to the linked list at index: idx
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + ": "); // Print index

            // Print LinkedList
            for (int ele : table[i])
                System.out.print(ele + " -> ");
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        SeparateChainingHT table = new SeparateChainingHT();
        table.insert(12);
        table.insert(13);
        table.insert(14);
        table.insert(22);
        table.display();
    }
}