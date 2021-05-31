import java.sql.SQLOutput;
 import java.util.Scanner;

 public class LargestAndSmallest {

     public static void main(String... args) {
         Scanner input = new Scanner(System.in);
         int number1;
         int number2;
         int number3;
         int number4;
         int number5;
         int Largest = 0;
         int Smallest = 0;

         System.out.println("Enter number1");
         number1 = input.nextInt();

         System.out.println("Enter number2");
         number2 = input.nextInt();

         System.out.println("Enter number3");
         number3 = input.nextInt();

         System.out.println("Enter number4");
         number4 = input.nextInt();

         System.out.println("Enter number5");
         number5 = input.nextInt();

         if (number1 > number2) {
             Largest = number1;
             Smallest = number2;
         }
         if (number3 > Largest) {
             Largest = number3;
         }
         if (number4 < Largest) {
             number4 = Smallest;
         }
         if (number5 < Largest) {
         }
         number5 = Smallest;

         System.out.printf("the Largest number is %d%n", Largest);
         System.out.printf("the Smallest number is %d%n", Smallest);
     }



 }