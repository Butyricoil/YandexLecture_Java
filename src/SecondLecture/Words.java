package SecondLecture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    public List<String> WordsAdd(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("There is no word");
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();
        String[] inputArray = input.split("\\s+");
        for (String s : inputArray)
            result.add(s);
        return result;

    }
}
