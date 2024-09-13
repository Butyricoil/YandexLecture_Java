/*дана последовательность чисел длиной N
найти минимальное четное число в последовательности
или вывести -1 если такого нету*/
package SecondLecture;

import java.util.List;

public class FindMinEvenInSeq {

    public FindMinEvenInSeq(List<Integer> seq) {
        int ans = -1;
        boolean flag = false;
        if (seq.size() < 1 || seq.isEmpty()|| seq == null)
            System.out.println("Invalid sequence length");
        else {
            for (Integer integer : seq) {
                if (integer % 2 == 0 && (flag != true || integer < ans)) {
                    ans = integer;
                    flag = true;
                }
            }
            System.out.println(ans);
        }
    }
}

