package SecondLecture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    public Words (List<String> words) {
        int minlen = words.get(0).length();
        for (String word : words)
            if (words.size()<  minlen)
                minlen = words.size();

        List<String> ans = new ArrayList<>();
        for (String word : words)
            if (word.length() == minlen)
                ans.add(word + ' ');

        System.out.println(ans);
    }
}
