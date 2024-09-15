package thirdLecture;
import java.util.ArrayList;

public class TwoTermWithSumX {

    void sum(ArrayList<Integer> nums, int x) {
        for (int a : nums) {
            for (int b : nums) {
                if (a + b == x) {
                    System.out.println("Two numbers are: " + a + ", " + b);
                    return;
                }
            }
        }
        System.out.println("No two numbers add up to " + x);
    }
}