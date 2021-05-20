package africa.semicolon.GradeApplication;
import java.util.Scanner;
public class GradeApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number");
        number = input.nextInt();

        if (number >= 90){
            System.out.print("A: ");
        }

        if ((number >= 80)&&(number < 90)){
            System.out.print("B: ");
        }

        if ((number >= 70)&&(number < 80)){
            System.out.print("C: ");
        }

        if ((number >= 60)&&(number < 70)){
            System.out.print("D: ");
        }

        if ((number <= 50)&&(number< 60)){
            System.out.print("fail: ");
        }


    }



}

