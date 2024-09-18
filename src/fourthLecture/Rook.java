/*
на шахматной доске NxN находятся М ладей
определить сколько пар бьют друг друга ладьи
задаются прой чисел I и J обозначающих координаты клетки
1<= N <= 10^9 ; 0<= M <= 2 * 10^5
*/

package fourthLecture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rook {

    public int countBeatingRooks(ArrayList<int[]> rookCoords) {

        Map<Integer, Integer> rooksInRow = new HashMap<>();
        Map<Integer, Integer> rooksInCol = new HashMap<>();

        for (int[] rook : rookCoords) {
            int row = rook[0];
            int col = rook[1];
            addRook(rooksInRow, row);
            addRook(rooksInCol, col);
        }
        return countPairs(rooksInRow) + countPairs(rooksInCol);

    }

    public void addRook(Map<Integer, Integer> roworcol, int key) {
    roworcol.put(key, roworcol.getOrDefault(key, 0) + 1);
}

    public int countPairs(Map<Integer, Integer> roworcol) {
        int pairs = 0;
        for (int key : roworcol.keySet()) {
            int count = roworcol.get(key);
            pairs += (count * (count - 1)) / 2;
        }
        return pairs;
    }


}
