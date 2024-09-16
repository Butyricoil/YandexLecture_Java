package thirdLecture;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("a");
        dictionary.add("b");
        dictionary.add("c");
        dictionary.add("ab");
        dictionary.add("bc");

        List<String> text = new ArrayList<>();
        text.add("a");
        text.add("bw");
        text.add("c");
        text.add("ab");
        text.add("bc");
        text.add("abc");

        List<Boolean> result = wordInDict.wordInDict(dictionary, text);
        System.out.println(result);
    }
}