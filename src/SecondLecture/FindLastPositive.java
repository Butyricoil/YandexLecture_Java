package SecondLecture;

import java.util.List;

// находит первое вхождение справа
public class FindLastPositive {

    //    public FindLastPositive(List<Integer> seq, int x) {
//        if (sequance.isEmpty() || sequance == null)
//            System.out.println("Sequance is empty");
//        else {
//            int ans = -1;
//            for (int i = 0; i < seq.size(); i++)
//                if (seq.get(i) == x)
//                    ans = i;
//            System.out.println(ans);
//        }
//    }
    public FindLastPositive(List<Integer> sequance, int x) {
        if (sequance.isEmpty())
            System.out.println("Sequance is empty");
        else {
            int ans = -1;
            for (int i = sequance.size() - 1; i >= 0; i--)
                if (sequance.get(i) == x && ans == -1)
                    ans = i;
            System.out.println(ans);
        }
    }
}


//ВОПРОС ПОЧЕМУ НЕ РАБОТАЕТ ОБРАТНЫЙ ОТСЧЕТ  В ФОРЕ?