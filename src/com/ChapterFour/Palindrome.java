package com.ChapterFour;

import java.util.Scanner;

public class Palindrome {
    public int palindrome(int number){
    int store=number;
    int remainder;
    int sum = 0;
        while (number > 0) {
        remainder = number % 10;
        sum = sum * 10 + remainder;
        number /= 10;
    }
//
//        if(sum==store) {
//            return "number is a Palindrome";
//    }
        return sum;//"number is not a Palindrome";
}
    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number");
        int number = sc.nextInt();
        System.out.println(palindrome.palindrome(number));

    }
}
