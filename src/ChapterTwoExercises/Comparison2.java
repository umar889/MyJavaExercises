package ChapterTwoExercises;

import java.util.Scanner;

public class Comparison2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Enter first integer");
        firstNumber = input.nextInt();

        System.out.println("Enter second integer");
        secondNumber = input.nextInt();

        if(firstNumber < secondNumber)
            System.out.println("first number is less than second number");

        if (firstNumber > secondNumber)
            System.out.println("first number is greater than second number");


    }
}
