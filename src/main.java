import FirstLecture.First_Task;
import FirstLecture.Second_Task;
import FirstLecture.SequenceProcessor;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {



////        First Task starts
//         System.out.println("imput number");
//         new First_Task(new Scanner(System.in).nextInt()).MaxCnt();
////        First Task end

        //Second Task start
        System.out.println("Enter numbers separated by spaces:");
        // Создаем объект класса InputProcessor и обрабатываем ввод
        List<Integer> seq = new Second_Task().processInput(new Scanner(System.in).nextLine());
        SequenceProcessor seqProcessor = new SequenceProcessor();
        if (seq == null || seq.isEmpty())
            System.out.println("No numbers entered");
        else {
            int seqsum = seq.get(0);
            for (int i = 1; i < seq.size(); i++) {
                seqsum += seq.get(i);
            }
            System.out.println("Sum of sequence elements: " + seqsum);
        }
        //Second Task end
    }

}
