package FirstLecture;

import java.util.ArrayList;
import java.util.List;

public class Second_Task {
    public List<Integer> processInput(String input) {
        String[] inputArray = input.split(" ");
        List<Integer> result = new ArrayList<>();

        if (inputArray == null || inputArray.length == 0) {

            for (String s : inputArray) {
                    result.add(Integer.parseInt(s));
            }
        }

        return result;
    }

}