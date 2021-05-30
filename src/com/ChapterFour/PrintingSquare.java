package com.ChapterFour;

import java.util.Scanner;

public class PrintingSquare {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your preferred number");
        int userInput = scanner.nextInt();
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;


        while (counter < userInput - 1) {
            System.out.print("* ");

            counter++;
        }
        while (counter1 < userInput - 1) {

            System.out.println("*                 *");
            counter1++;
        }

        while (counter2 < userInput) {
            System.out.print("* ");
                counter2++;
            }

        }
    }





