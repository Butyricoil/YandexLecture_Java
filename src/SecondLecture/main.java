package SecondLecture;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
// ! Error ! когда seq пустая программа просит ввести число и чтоб ы ты не ввел ошибка будет

        //first task  starts
        System.out.println("input numbers by space");
        List<Integer> seq = new Sequence().processInput(new Scanner(System.in).nextLine());
        System.out.println("input first positive number");
        new FindPositive(seq, new Scanner(System.in).nextInt());
        System.out.println(seq);
        //first task ends


        //second task start
        System.out.println("Enter numbers separated by spaces:");
        List<Integer> seq2 = new Sequence().processInput(new Scanner(System.in).nextLine());
        System.out.println("input first positive number");
        new FindLastPositive (seq2, new Scanner(System.in).nextInt());
        System.out.println(seq2);
        //second task end


        //third task start
        System.out.println("Enter numbers separated by spaces:");
        List<Integer> seq3 = new Sequence().processInput(new Scanner(System.in).nextLine());
        new FindMaxInSubsequence(seq3);
        System.out.println("Maximum in sequence: " + (seq3) );
        //third task end
    }
}
