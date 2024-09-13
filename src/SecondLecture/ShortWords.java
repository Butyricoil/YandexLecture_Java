package SecondLecture;

import java.util.ArrayList;
import java.util.List;

/*
дана последовательность слов
вывести вссе самые короткие слова
*/
public class ShortWords {
    public ShortWords (List<String> words) {
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
