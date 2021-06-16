package com.ChapterFour;

import java.util.Scanner;

public class PrintAsterisks {
    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("* ");
        for (int j = i; j <= i - 1; j++) {
            System.out.print(" **");
        }

        for (int j = 1; j <= i - 1; j++) {
            System.out.println(" ");
        }

        for (int j = 1; j <= 10 - i + 1 ; j++) {
        }

        for (int j = 1; j <= 10 - i ; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i ; j++) {
            System.out.print("* ");
        }

        System.out.println();
        Thread.sleep(1000);
        }
    }

