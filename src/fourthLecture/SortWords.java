/*
сгрупирировать слова
Sample input ["eat" , "tea", "tan", "ate", "nat", "bat"]
Sample output [["eat" , "eat", "tea",]["nat", "tan"]["bat"]]
*/
package fourthLecture;

import java.util.*;

public class SortWords {
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!groups.containsKey(sortedWord)) {
                groups.put(sortedWord, new ArrayList<>());
            }

            groups.get(sortedWord).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
