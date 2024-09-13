package SecondLecture;

import java.util.List;

/* дана последовательность длинною N
Найти второе максимальное число в последовательность /
 */
public class FindSecMaxInSeq {

    public FindSecMaxInSeq(List<Integer> sequance) {
        int max1;
        int max2;
        if (sequance.size() < 2 || sequance == null)
            System.out.println("Sequence empty or less than 2");
        else {
            if (sequance.get(0) >= sequance.get(1)) {
                max1 = sequance.get(0);
                max2 = sequance.get(1);
            } else {
                max1 = sequance.get(1);
                max2 = sequance.get(0);
            }
            for (int i = 2; i < sequance.size(); i++) {
                if (sequance.get(i) > max1) {
                    max2 = max1;
                    max1 = sequance.get(i);
                } else if (sequance.get(i) > max2 && sequance.get(i) != max1) {
                    max2 = sequance.get(i);
                }
            }
            System.out.println("First Maximum is " + max1 + "\nSecond Maximum is  " + max2 + "");
        }
    }
}
