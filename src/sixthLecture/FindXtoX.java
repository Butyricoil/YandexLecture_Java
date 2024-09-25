/*Задана отсортированная по неубыванию последовательность
* из N чисел и число X
* Необходимо определить сколько число X входит в последовательность */

package sixthLecture;

public class FindXtoX {

    public boolean checkIsGt(int index, int[] parameter, int parameter2) {
        int[] seq = parameter;
        int x = parameter2;
        return seq[index] > x;
    }

    public boolean checkIsGe(int index, int[] parameter, int parameter2) {
        int[] seq = parameter;
        int x = parameter2;
        return seq[index] >= x;
    }

    public int lBinSearch(int left, int right, int x, int[] seq) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (checkIsGe(mid, seq, x)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int findFirst(int[] seq, int x) {
        int ans = lBinSearch(0, seq.length - 1, x, seq);
        if (checkIsGt(ans, seq, x)) {
            return seq.length; // Если не найдено, возвращаем длину массива
        } else {
            return ans;
        }
    }

    public int countX(int[] seq, int x) {
        int indexGt = findFirst(seq, x);
        int indexGe = findFirst(seq, x);
        return indexGe - indexGt;
    }
}
