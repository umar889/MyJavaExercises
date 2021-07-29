package africa.Chaptereight;

import java.util.Scanner;

public class SalesInvoice2 {
    public static void main(String[] args) {

            final double TSHIRT_PRICE = 16.1075;
            final double CHIPS_PRICE = 1.5215;
            final double COKE_PRICE = 2.99;
            String a;
            int numberShirts = 0;
            int numberChips = 0;
            int numberCoke = 0;
            double tshirtTotal = TSHIRT_PRICE * numberShirts;
            double chipsTotal = CHIPS_PRICE * numberChips;
            double cokeTotal = (COKE_PRICE + 1.20) * numberCoke;
            double finalTotal = tshirtTotal + chipsTotal + cokeTotal;
            {
            }

            Scanner input;

//            public static void main(String[] args) {
                input = new Scanner(System.in);
                System.out.println("What's your name?");
                a = input.nextLine();
                System.out.println("Welcome to Umar's Market, " + a + "! We have the following items for sale:");
                System.out.println("T-shirt     $18.95    15% off");
                System.out.println("Chips       $1.79     15% off");
                System.out.println("Coke        $2.99");
                System.out.println("How many T-shirts do you want?");
                System.out.println("How many bags of potato chips?");
                System.out.println("What about 12-pack coke?");
                tshirtTotal = tshirtTotal * .85;
                chipsTotal = chipsTotal * .85;
                tshirtTotal = tshirtTotal * 1.06;
                System.out.println("Your total is: " + finalTotal);

            }

        }

