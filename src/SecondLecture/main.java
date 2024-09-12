package SecondLecture;

import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //first task  starts
        System.out.println("input numbers by space");
        List<Integer> seq = new Sequnace.Sequance().processInput(new Scanner(System.in).nextLine());
        System.out.println("imput first positive number");
        new FindPositive(seq, new Scanner(System.in).nextInt());
        System.out.println(seq);
        //first task ends
    }
}
