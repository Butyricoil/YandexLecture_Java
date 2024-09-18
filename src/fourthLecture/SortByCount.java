package fourthLecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByCount {

    public static List<Integer> sortByCount(List<Integer> seq) {
        if (seq == null || seq.isEmpty()) {
            return new ArrayList<>();
        }

        int minval = Collections.min(seq);
        int maxval = Collections.max(seq);
        int k = maxval - minval + 1;

       if (k <= 0) {
            throw new IllegalArgumentException("Invalid range for counting sort");
        }

        int[] count = new int[k];
        for (int now : seq) {
            count[now - minval]++;
        }

        int nowpos = 0;
        for (int val = 0; val < k; val++) {
            for (int i = 0; i < count[val]; i++) {
                seq.set(nowpos, val + minval);
                nowpos++;
            }
        }

        return seq;
    }
}