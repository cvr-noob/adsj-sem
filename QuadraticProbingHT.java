public class QuadraticProbingHT {
    private final int SIZE = 10;
    private Integer[] table;

    QuadraticProbingHT() {
        table = new Integer[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void insert(int key) {
        int index = hash(key);
        int i = 0;

        while (i < SIZE) {
            int newIndex = (index + i * i) % SIZE;
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
        QuadraticProbingHT table = new QuadraticProbingHT();
        table.insert(12);
        table.insert(13);
        table.insert(14);
        table.insert(22);
        table.display();
    }
}
