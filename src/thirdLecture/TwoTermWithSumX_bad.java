package thirdLecture;
import java.util.ArrayList;

public class TwoTermWithSumX_bad {

    void sum(ArrayList<Integer> nums, int x) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1 ; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == x) {
                    System.out.println("Two numbers are: " + nums.get(i) + ", " + nums.get(j) + ", " + nums.get(j));
                    return;
                }
            }
        }
        System.out.println("No two numbers add up to " + x);
    }
}