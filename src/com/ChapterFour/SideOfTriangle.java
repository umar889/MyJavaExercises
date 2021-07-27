package com.ChapterFour;

import java.util.Scanner;

public class SideOfTriangle {
    private static Scanner sc;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st side: ");

        int a = sc.nextInt();

        System.out.print("Enter 2nd side: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd side: ");
        int c = sc.nextInt();

        System.out.printf("The entered values could%sbe a triangle\n",
                isTriangle(a, b, c) ? " " : " NOT ");
    }
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
}


