package sixthLecture;

import java.util.Scanner;

public class Main {



  /*  public static void main(String[] args) {
        BiFindSchool bfs = new BiFindSchool();
        int N = 15; // текущее число членов совета
        int K = 3;  // текущее число родителей в совете

        // Ищем минимальное число родителей, которых нужно добавить
        int result = bfs.lBinSearch(0, N, N, K);
        System.out.println("Минимальное число родителей для добавления: " + result);
    }
*/
/*
    public static void main(String[] args) {
        BiFindSchool biFindSchool = new BiFindSchool();

        // Пример вызова бинарного поиска
        int result = biFindSchool.lBinSearch(1, 100, 50, 20);
        System.out.println("Result: " + result);
    }*/


    public static void main(String[] args) {

        BiFindSchool biFindSchool = new BiFindSchool();
        int result = biFindSchool.lBinSearch(1, 100, 50, 20);
        System.out.println("Result: " + result);
    }
}


