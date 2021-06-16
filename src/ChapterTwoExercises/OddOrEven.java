package ChapterTwoExercises;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter the integer");
        number = input.nextInt();
        if (number % 2 == 0){
            System.out.printf("%d is an even number", number);
        }
        else {
            System.out.printf("%d is an odd number", number);
        }

    }
}

