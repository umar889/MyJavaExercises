package ChapterTwoExercises;

import java.util.Scanner;

public class Determination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int result;

        System.out.println("Enter first integer");
        firstNumber = input.nextInt();

        System.out.println("Enter second integer");
        secondNumber = input.nextInt();

        if(firstNumber%secondNumber==0){
            System.out.println("first number is a multiple of second number "+secondNumber);
        }else {
            System.out.println("Number is not a multiple");
        }

        
    }
}
