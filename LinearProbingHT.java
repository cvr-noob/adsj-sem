public class LinearProbingHT {
    private final int SIZE = 10;
    private Integer[] table;

    LinearProbingHT() {
        table = new Integer[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void insert(int key) {
        int index = hash(key);
        int start = index;

        while (table[index] != null) {
            index = (index + 1) % SIZE;

            if (index == start) {
                System.out.println("Table is full");
                return;
            }
        }

        table[index] = key;
    }

    public void display() {
        for (int i = 0; i < SIZE; i++)
            System.out.println(i + ": " + table[i]);
    }

    public static void main(String[] args) {
        LinearProbingHT table = new LinearProbingHT();
        table.insert(12);
        table.insert(13);
        table.insert(14);
        table.insert(22);
        table.display();
    }
}