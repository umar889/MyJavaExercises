package chapterfiveexercises;

import java.util.Scanner;

public class SwitchStatement {
    private static Object value;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userPrompt = 0;

        do {
                System.out.println("Enter the number");
                userPrompt = input.nextInt();
            switch (userPrompt) {
                case 1:
                    value = "one";
                    break;
                case 2:
                    value = "two";
                    break;
                case 3:
                    value = "three";
                    break;
                case 4:
                    value = "four";
                    break;
                case 5:
                    value = "five";
                    break;
                case 6:
                    value = "six";
                    break;
                case 7:
                    value = "seven";
                    break;
                case 8:
                    value = "eight";
                    break;
                case 9:
                    value = "nine";
                    break;
                case 10:
                    value = "ten";
                    break;
                case -1: break;
                default:
                    value = "You are to enter between 1 - 10";


                }
            System.out.println(value);
            } while (userPrompt != -1);


        }
        
    }


