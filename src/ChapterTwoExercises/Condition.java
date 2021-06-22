package ChapterTwoExercises;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int age = input.nextInt();

        if (age >= 10 || age <= 30) {
            System.out.println("stay here");
        }else {
            System.out.println("kindly go back");

        }
    }
}