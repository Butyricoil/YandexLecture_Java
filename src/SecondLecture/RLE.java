
/*
 * Задача: Сжатие строки
 *
 * Дана строка, состоящая из букв латинского алфавита (a-z, A-Z). Если символ встречается несколько раз подряд,
 * его следует заменить на символ и количество его повторений. Если символ встречается только один раз, он остаётся
 * без изменения.
 *
 * Пример:
 *
 * Вход: AABBBBCCCC
 * Выход: A2B4C4
 *
 * Пояснение:
 * - Если символ повторяется более одного раза, после него указывается количество его повторений.
 * - Если символ встречается один раз, он остаётся без изменений.
 */

package SecondLecture;

public class RLE {
    private String encodedString;

    public RLE(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("Input string is empty or null");
        } else {
            this.encodedString = encode(s);
            System.out.println("Encoded: " + this.encodedString);
        }
    }

    private String encode(String s) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        char lastChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == lastChar) {
                count++;
            } else {
                encoded.append(lastChar);
                encoded.append(count);
                lastChar = currentChar;
                count = 1;
            }
        }

        // Append the last set of characters
        encoded.append(lastChar);
        encoded.append(count);

        return encoded.toString();
    }
}
