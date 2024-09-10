/*   Пререберем все позиции и для каждой позиции
в строке еще раз переберем  все позици и в случае
совпадения прибавим к счетчику едкницу. Найдём Максимальное
значение счётчика
 */

package FirstLecture;
import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class First_Task {

    private int S;
    private String ans;
    private int c;

    public void setValues(int S) {

        this.S = S;
    }

    public void getValues () {

        System.out.println(S + "\n" + ans + "\n" + c);
    }

    public void MaxCnt(){

        int c = 0;
        String s = String.valueOf(S);
        for (int i = 0; i != s.length(); i++) {
            for (int j = 0; j != s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                     c++;
                 }
                if(this.c < c) {
                    this.ans = String.valueOf(s.charAt(i));
                    this.c = c;
                }
            }
        }
        System.out.println("Максимальное количество одинаковых символов: " + c + ", символ: " + ans);
    }
}
