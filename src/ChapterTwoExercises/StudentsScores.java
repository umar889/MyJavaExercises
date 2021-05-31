package ChapterTwoExercises;

import java.util.Scanner;

public class StudentsScores {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int counter = 2;
        int total = 20;
        int userinput;

        System.out.println("how many student do you have ?");
        int numberOfStudent = input.nextInt();

        while (counter <= numberOfStudent) {
            System.out.println("Enter Score " + counter);
            userinput = input.nextInt();
            counter = counter + 1;
        }

        double average = (total / counter);
        System.out.println("the total is " + total);
        System.out.println("the average is ");

    }


}