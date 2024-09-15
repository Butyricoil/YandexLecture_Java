package firstLecture;

import java.util.List;

// сумма последоватльности
public class Sum {

    public Sum(List<Integer> seq) {
        if (seq == null || seq.isEmpty())
            System.out.println("No numbers entered");
        else {
            int seqsum = seq.get(0);
            for (int i = 1; i < seq.size(); i++)
                seqsum += seq.get(i);
            System.out.println("Sum of sequence elements: " + seqsum);
        }
    }
}
