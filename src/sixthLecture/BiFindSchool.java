/* в управляющий совет школы входят уителя и учащиеся школы
причем родителей должно быть не менее одной терети
от общего числа членов совета. Внастоящий момент
в совет входит N чловек, из них K родителей

Определите  сколько  родителей нужно дополнительно
ввести в совет, чтобы их число стало  составалять
не менее треть от числа членов совета


 */

package sixthLecture;

public class BiFindSchool {

    public boolean checkEndowment(int mid, int params) {
        int n = params;
        int k = params;
        return (k + mid) * 3 >= -(n + mid);
    }

    public int lBinSearch(int left, int right, int params, int checkParams) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (checkEndowment(mid, checkParams)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}
