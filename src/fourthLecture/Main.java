package fourthLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static fourthLecture.SortWords.groupAnagrams;

public class Main {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        List<List<String>> result = groupAnagrams(words);

        System.out.println(result);
    }

}