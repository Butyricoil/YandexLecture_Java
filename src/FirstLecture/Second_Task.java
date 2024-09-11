package FirstLecture;
import java.util.ArrayList;
import java.util.List;

// Второе задание создает последовательность из строки с пробелами

public class Second_Task {

    public List<Integer> processInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }

        String[] inputArray = input.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : inputArray) {
            result.add(Integer.parseInt(s));
        }

        return result;
    }
}



