package com.ChapterFour;

import java.util.Scanner;

public class ConvertToDecimal {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

                int binary;
                int bit;
                int decimal;

                bit = 1;
                decimal = 0;


                System.out.print("Enter a binary number: ");
                binary = input.nextInt();

                while (binary != 0) {
                    decimal += binary % 10 * bit;
                    binary /= 10;
                    bit *= 2;
                }

                System.out.printf("Decimal is: %d\n", decimal);

            }
        }