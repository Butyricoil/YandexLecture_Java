package SecondLecture;

import java.util.ArrayList;
import java.util.List;

// написать хотябы ABCD...
public class RLE_demo {
    public RLE_demo(String s) {

        if (s == null || s.isEmpty()) {
            System.out.println("Input list is empty or null");
            return;
        } else {
            char lastsymbol = s.charAt(0);
            StringBuilder ans = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != lastsymbol) {
                    ans.append(lastsymbol);
                    lastsymbol = s.charAt(i);
                }
            }
            ans.append(lastsymbol);
            System.out.println(ans);
        }
    }
}