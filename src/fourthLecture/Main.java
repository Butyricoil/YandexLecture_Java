package fourthLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(List.of(1, 3, 4, 6, 9));
        List<Integer> sortedA = SortByCount.sortByCount(A);
        System.out.println(sortedA);
    }
}