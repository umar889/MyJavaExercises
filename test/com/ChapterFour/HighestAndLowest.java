package com.ChapterFour;

import java.util.Scanner;

public class HighestAndLowest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highest = 0;
        int lowest = 0;
        int userInput = 0;

        System.out.println("Enter 10 numbers to print the highest and the lowest");

        int counter = 1;

        while (counter <= 10){
            userInput = input.nextInt();
            highest = Math.max(userInput, highest);
            if (counter == 1){
                lowest = userInput;
            }
            lowest = Math.min(userInput, lowest);
            counter++;
        }
        System.out.printf("highest is %d%n", highest);
        System.out.printf("lowest is %d%n", lowest);
    }

}