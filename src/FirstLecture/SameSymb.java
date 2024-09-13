package FirstLecture;

import java.util.HashMap;
import java.util.Map;

public class SameSymb {

    // Объявляем переменные экземпляра
    private int S;
    private String ans;
    private int c;

    // конструктор для установки значения переменной S
    public SameSymb(int S) {
        this.S = S;
    }

    // Метод для вывода значений переменных S, ans и c
    public void getValues() {
        System.out.println(S + "\n" + ans + "\n" + c);
    }

    // Оптимизированный метод для поиска максимального количества одинаковых символов
    public void MaxCnt() {
        // Преобразуем число S в строку
        String s = String.valueOf(S);

        // Используем HashMap для подсчета вхождений каждого символа
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Перебираем все символы в строке
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Если символ уже есть в карте, увеличиваем его счетчик, иначе добавляем
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // Перебираем карту и находим символ с максимальным количеством вхождений
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > this.c) {
                this.ans = String.valueOf(entry.getKey());
                this.c = entry.getValue();
            }
        }

        // Выводим результат
        System.out.println("maximum of the same symbols" + c + ", symbol: " + ans);
    }
}
