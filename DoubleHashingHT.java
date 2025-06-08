public class DoubleHashingHT {
    private final int SIZE = 10;
    private Integer[] table;

    DoubleHashingHT() {
        table = new Integer[SIZE];
    }

    private int h1(int key) {
        return key % SIZE;
    }

    private int h2(int key) {
        return 7 - (key % 7); // Must be non-zero and relatively prime to SIZE
    }

    public void insert(int key) {
        int index1 = h1(key);
        int index2 = h2(key);

        int i = 0;

        while (i < SIZE) {
            int newIndex = (index1 + i * index2) % SIZE;
            if (table[newIndex] == null) {
                table[newIndex] = key;
                return;
            }
            i++;
        }

        System.out.println("Table is full");
    }

    public void display() {
        for (int i = 0; i < SIZE; i++)
            System.out.println(i + ": " + table[i]);
    }

    public static void main(String[] args) {
        DoubleHashingHT table = new DoubleHashingHT();
        table.insert(12);
        table.insert(13);
        table.insert(14);
        table.insert(22);
        table.insert(32);
        table.display();
    }
}
