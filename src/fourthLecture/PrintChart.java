/*
дана строка S
вывести гистограмму( коды  символы отсортированы )
s = Hllo world
#
##
############
!,Hdelorw
*/

package fourthLecture;

import java.util.*;

public class PrintChart {
    public PrintChart(String s) {

        Map <Character, Integer> symcount = new HashMap<>();
        int maxsymcount = 0;

        for (char sym : s.toCharArray()) {
            if (!symcount.containsKey(sym)) {
                symcount.put(sym, 0);
            }
            symcount.put(sym, symcount.get(sym) + 1);
            maxsymcount = Math.max(maxsymcount, symcount.get(sym));
        }

        List<Character> sortedunicsyms = new ArrayList<>(symcount.keySet());
        Collections.sort(sortedunicsyms);

        for (int row = maxsymcount; row > 0; row--) {
            for (char sym : sortedunicsyms) {
                if (symcount.get(sym) >= row)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println(String.join("", sortedunicsyms.stream().map(String::valueOf).toArray(String[]::new)));
    }
}
