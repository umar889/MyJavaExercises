package ChapterTwoExercises;
        // Algorithm
// 1 prompt user enter 2 integer
// 2 obtain numbers
// 3 display sum
// 4 display difference
// 5 display product
// 6 display quotients

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        int result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter firstNumber: ");
        firstNumber = input.nextInt();
        System.out.print("Enter secondNumber: ");
        secondNumber = input.nextInt();

        result = firstNumber+secondNumber;
        System.out.printf("sum is %d%n: ", result);
        result = firstNumber-secondNumber;
        System.out.printf("difference is %d%n: ",result);
        result = firstNumber*secondNumber;
        System.out.printf("product is %d%n: ",result);
        result = firstNumber/secondNumber;
        System.out.printf("quotient is %d%n:",result);
    }
}
