/*
дано два числа X и Y без ведущих нулей
необходимо проверить можно ли получить первое
из второго перестановкой цифр
*/

package fourthLecture;

public class IsDigitPermutation {
    private int value = 10;

    public IsDigitPermutation(int x, int y) {
        int[] digitX = countdigit(x);
        int[] digitY = countdigit(y);

        for (int digit =0; digit < value; digit++)
            if (digitX[digit] == digitY[digit])
                System.out.println("False");;
        System.out.println("True");
    }

    private int[] countdigit(int num) {
        int[] digitcount = new int[value];
        while (num > 0) {
            int lastdigit = num % 10;
            digitcount[lastdigit]++;
            num /= 10;
        }
        return digitcount;
    }
}
