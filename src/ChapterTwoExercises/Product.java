package ChapterTwoExercises;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C, D, result;

        System.out.printf("Enter first integer");
        A = input.nextInt();

        System.out.println("Enter second integer");
        B = input.nextInt();

        System.out.println("Enter third integer");
        C = input.nextInt();

        result = A * B * C;
        System.out.printf("product is %d%n", result);

            }
        };


