package thirdLecture;

import java.util.ArrayList;
import java.util.HashSet;

/*
дана последовательность положительных чисел длинной N и число X
нужно найти два различных числа A и B из последовательности таких чтo
 A + B = X или вернуть пару 0. 0 если таких чисел нет
 */
public class TwoTermWithSumX_good {

    public void sum (ArrayList<Integer> nums, int x) {
        HashSet<Integer> prevNums = new HashSet<Integer>();
        for (int nowNum : nums) {
            if (prevNums.contains(x - nowNum)) {
                System.out.println("Two numbers are: " + (x - nowNum) + ", " + nowNum);
                break;
            }
            prevNums.add(nowNum);
        }
        System.out.println("Two numbers are: " + 0 + 0);
    }
}
