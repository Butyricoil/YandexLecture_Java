package secondLecture;
import java.util.ArrayList;
import java.util.List;


public class Sequence {


    public List<Integer> processInput(String input) {
        List<Integer> result = new ArrayList<>();

        if (input == null || input.trim().isEmpty()) {
            System.out.println("Empty input. Please provide a valid sequence of numbers.");
            return result;
        } else {
            String[] inputArray = input.split("\\s+");
           for (String s : inputArray)
                result.add(Integer.parseInt(s));
            return result;
        }
    }
}
