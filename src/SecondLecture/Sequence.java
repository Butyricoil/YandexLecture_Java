package SecondLecture;

import java.util.ArrayList;
import java.util.List;


public class Sequence {


    public List<Integer> processInput(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Sequence is empty");
            return null;
        } else {
            String[] inputArray = input.split(" ");
            List<Integer> result = new ArrayList<>();
            for (String s : inputArray)
                result.add(Integer.parseInt(s));
            return result;
        }
    }
}
