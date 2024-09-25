/* Юра решил подготовиться к собеседованию в Яндекс
* Он выбрал на сайте N задач В первый день Юра решил К задач
* а в каждый  следуйщий день Юра решил на однк задачу больше
* чем в предыдущий день*/

package sixthLecture;

public class TaskDoFind {

    public class BiFindSchool {

        public boolean checkendownment(int days, int params) {
            int n = params;
            int k = params;
            return (k + (k + days - 1)) * days / 2 >= n;
        }

        public int lBinSearch(int l, int r, int check, int checkparams) {
            while (l < r) {
                int m = (l + r) / 2;
                if (checkendownment(m, checkparams)) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            return l;
        }
    }
}
