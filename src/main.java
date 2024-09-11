import FirstLecture.First_Task;
import FirstLecture.Second_Task;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);


//        First_Task task = new First_Task();
//
//        System.out.println("imut number");
//        int number = sc.nextInt();
//        task.setValues(number);
//        task.MaxCnt();
        System.out.println("Enter numbers separated by spaces:");
        String input = sc.nextLine();

        // Создаем объект класса InputProcessor и обрабатываем ввод
        Second_Task processor = new Second_Task();

        List<Integer> seq = processor.processInput(input);


        if (seq == null || seq.isEmpty()) {
            System.out.println("No numbers entered or all are the same");
        }
        else {
            int seqsum = seq.get(0);
            for (int i = 0; i < seq.size(); i++) {
                seqsum += seq.get(i);
            }
            System.out.println("Sum of sequence elements: " + seqsum);
        }
    }
}
