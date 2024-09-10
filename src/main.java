import FirstLecture.First_Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        First_Task task = new First_Task();

        System.out.println("введите число ");
        int number = sc.nextInt();
        task.setValues(number);
        task.MaxCnt();

    }
}
