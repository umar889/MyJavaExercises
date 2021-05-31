package Kata;

public class Kata1 {
        public int reverse(int number) {
            int number1 = number/ 10000 ;
            int number2 = (number / 1000 )% 10;
            int number3 = (number / 100) % 10;
            int number4 = (number / 10) % 10;
            int number5 = number   % 10;
            number5*=10000;
            number4*=1000;
            number3*= 100;
            number2*= 10;
            number1*= 1;
            return number5+number4+number3+number2+number1;


        }
    }

