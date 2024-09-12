package SecondLecture;

import java.util.List;
/* дана последовательность чисел длинной н найти первое левое
вхождние положительного числа Х в нее или вывести -1
если чисо Х не встречалось
 */
public class FindPositive {

    public  FindPositive (List<Integer> seq, int x ) {
        if (seq.isEmpty())
            System.out.println("No numbers entered");
        else  {
        int ans = -1;
        for ( int i = 0; i < seq.size(); i++ )
            if ( seq.get(i) == x && ans == -1 )
                ans = i;
        System.out.println(ans);
    }
}
}