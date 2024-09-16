/*
дан словарь из N слов, длинна которгого не превосходит K
в записи каждого из M слов текста каждого длинной K может быть пропущена одна буква
Для каждого слова сказать входит ли оно (возмождно с пропущенной буквой )всловарь
*/
package thirdLecture;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class wordInDict {

    public static List<Boolean> wordInDict(Set<String> dictionary, List<String> text) {
        Set<String> goodWords = new HashSet<>(dictionary);

        // Генерация хороших слов из словаря
        for (String word : dictionary) {
            for (int delPos = 0; delPos < word.length(); delPos++) {
                String modifiedWord = word.substring(0, delPos) + word.substring(delPos + 1);
                goodWords.add(modifiedWord);
            }
        }

        // Проверка наличия слов из текста в хорошем словаре
        List<Boolean> ans = new ArrayList<>();
        for (String word : text) {
            ans.add(goodWords.contains(word));
        }

        return ans;
    }
}
