package fourthLecture;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Пример использования
        ArrayList<int[]> rookCoords = new ArrayList<>();
        rookCoords.add(new int[]{1, 2});
        rookCoords.add(new int[]{2, 2});
        rookCoords.add(new int[]{1, 3});
        rookCoords.add(new int[]{4, 5});

        Rook rookProblem = new Rook();
        int result = rookProblem.countBeatingRooks(rookCoords);
        System.out.println("Количество пар: " + result);
    }
}