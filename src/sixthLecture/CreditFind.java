/*расчиаем кредитный платёж
 * задана процентная ставка по кредиту (X% годовых )
 * срок кредитования (N месяцев) и сумма кредита (M рублей )
 *
 * Необходимо расситать размер аннуететного платежа*/

package sixthLecture;

public class CreditFind {

    public boolean CheckMonthLyperc(double mounthprocent, double yearprocent) {
        double mSum = 1 + mounthprocent / 100.0f;
        double ySum = 1 + yearprocent / 100.0f;
        return Math.pow(mSum, 12) >= ySum;
    }
    public double fbinsearch(int l, int r, double eps, double mounthprocent, double yearprocent) {
        while (l + eps < r) {
            int m = (l + r) / 2;
            if (CheckMonthLyperc(mounthprocent, yearprocent))
                r = m;
            else
                l = m;
        }
        return l;
    }

}


