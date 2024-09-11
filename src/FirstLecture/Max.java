package FirstLecture;

import java.util.List;

// максимум посследовательности
public class Max {
    public Max(List<Integer> seq) {
        if (seq == null || seq.isEmpty())
            System.out.println("No numbers entered");
        else {
            int max = seq.get(0);
            for (int i = 1; i < seq.size(); i++) {
                if (seq.get(i) > max)
                    max = seq.get(i);

            }
            System.out.println("maximum number is "+ max);
        }
    }
}
