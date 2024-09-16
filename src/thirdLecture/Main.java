package thirdLecture;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TwoTermWithSumX_good obj = new TwoTermWithSumX_good();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        int x = 8; // You can change this value to test different scenarios

        obj.sum(nums, x);
    }
}