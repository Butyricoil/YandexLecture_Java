package SecondLecture;
import java.util.List;

/* дана последовательность длинною N
Найти максимальное число в последовательность /
 */
public class FindMaxInSubsequence {

    public FindMaxInSubsequence(List<Integer> sequance) {
        if (sequance == null || sequance.isEmpty()) {
            System.out.println("Sequence is null or empty");
        } else {
            int max = sequance.getFirst();
            for (int i = 1; i < sequance.size(); i++)
                if (sequance.get(i) > max)
                    max = sequance.get(i);
            System.out.println(max);

        }
    }
}