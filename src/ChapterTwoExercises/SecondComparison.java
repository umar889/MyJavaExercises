package ChapterTwoExercises;

import java.util.Scanner;

public class SecondComparison {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int result;9
        int largest = 0;
        int smallest = 0;

        System.out.print("Enter first integer: ");
        firstNumber = input.nextInt();

        System.out.print("Enter second integer: ");
        secondNumber = input.nextInt();

        System.out.print("Enter third integer: ");
        thirdNumber = input.nextInt();

        result = firstNumber + secondNumber + thirdNumber;
        System.out.printf("sum is %d%n", result);

        result = firstNumber * secondNumber * thirdNumber;
        System.out.printf("product is %d%n", result);

        result = firstNumber / secondNumber / thirdNumber;
        System.out.printf("quotient is %d%n", result);

        result = firstNumber % secondNumber % thirdNumber;
        System.out.printf("difference is %d%n", result);

        result = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.printf("average is %d%n", result);

        if (firstNumber > secondNumber) {
            largest = firstNumber;
            smallest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }
        if (thirdNumber < smallest) {
            smallest = thirdNumber;
        }
        System.out.printf("The largest is %d%n", largest);
        System.out.printf("The smallest is %d%n", smallest);
    }
}