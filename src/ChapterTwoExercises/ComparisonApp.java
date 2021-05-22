package ChapterTwoExercises;

import java.util.Scanner;

public class ComparisonApp {

    public static String compare(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber){
            if (firstNumber > secondNumber) {
                return (firstNumber + " is larger");
            }
            else{
                return (secondNumber + " is larger");
            }
        }
        else{
            return ("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner scannerScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNumber = scannerScanner.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = scannerScanner.nextInt();

        String result = compare(firstNumber, secondNumber);
        System.out.println(result);
    }
}
