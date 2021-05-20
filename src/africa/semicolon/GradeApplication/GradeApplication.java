package africa.semicolon.GradeApplication;
import java.util.Scanner;
public class GradeApplication {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();
        if (number >= 90 && number < 100){
            System.out.print("A");
        }else

        if (number >= 80 && number < 90){
            System.out.print("B");
        }

        else

        if (number >= 70 && number < 80){
            System.out.print("C");
        }

        else

        if (number >= 60 && number < 70){
            System.out.print("D");
        }

        else
        {
            System.out.print("fail");

        }

    }


}

