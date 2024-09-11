package FirstLecture;
import java.util.ArrayList;
import java.util.List;

// Второе задание создает последовательность из строки с пробелами

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

    public void isEmpty(List<Integer> sequence) {
        if (sequence.isEmpty()) {
            System.out.println("No numbers entered or all are the same");
        } else {
            int seqsum = sequence.getFirst();
            for (Integer integer : sequence) {
                seqsum += integer;
            }
            System.out.println("Sum of sequence elements: " + seqsum);
        }
    }

}