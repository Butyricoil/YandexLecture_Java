package thirdLecture;

import java.util.LinkedList;

public class MyHashSet {
    private static final int set_size = 10; // Размер множества
    private LinkedList<Integer>[] mySet;

    // Конструктор
    public MyHashSet() {
        mySet = new LinkedList[set_size];
        for (int i = 0; i < set_size; i++) {
            mySet[i] = new LinkedList<>();
        }
    }

    // Метод для поиска элемента
    public boolean find(int x) {
        int index = x % set_size;
        for (int now : mySet[index]) {
            if (now == x) {
                return true;
            }
        }
        return false;
    }

    // Метод для добавления элемента
    public void add(int x) {
        int index = x % set_size;
        if (!find(x)) {
            mySet[index].add(x);
        }
    }


    // Метод для удаления элемента
    public void delete(int x) {
        int index = x % set_size;
        LinkedList<Integer> xList = mySet[index];
        for (int i = 0; i < xList.size(); i++) {
            if (xList.get(i) == x) {
                xList.set(i, xList.get(xList.size() - 1)); // Замена на последний элемент  чесно ли использовать?
                xList.removeLast(); // Удаление последнего элемента                        чесно ли использовать?
                return;
            }
        }
    }

    // Метод для печати элементов
    public void print() {
        for (int i = 0; i < set_size; i++) {
            System.out.print("Bucket " + i + ": ");
            for (int x : mySet[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

