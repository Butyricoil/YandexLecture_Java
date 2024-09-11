package FirstLecture;

import java.util.List;

public class Second_Task_1 {

    public Second_Task_1(List<Integer> seq) {
        if (seq == null || seq.isEmpty())
            System.out.println("No numbers entered");
        else {
            int seqsum = seq.get(0);
            for (int i = 1; i < seq.size(); i++) {
                seqsum += seq.get(i);
            }
            System.out.println("Sum of sequence elements: " + seqsum);
        }
    }
}
