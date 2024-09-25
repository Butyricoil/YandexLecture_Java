package sixthLecture;

import java.util.Scanner;

public class biFind {

    // Левый бинарный поиск
    public void lBinSearch(int[] arr, int checkParams) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] == checkParams) {
                System.out.println("Element found at index " + m);
                return;
            }
            if (checkParams < arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        System.out.println("Element not found");
    }

    // Правый бинарный поиск
    public void rBinSearch(int[] arr, int checkParams) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == checkParams) {
                System.out.println("Element found at index " + m);
                return;
            }
            if (checkParams < arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        System.out.println("Element not found");
    }

}
