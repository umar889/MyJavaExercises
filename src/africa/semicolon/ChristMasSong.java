package africa.semicolon;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ChristMasSong {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int userPrompt = 0;
        String day = "";

        do {
            System.out.println("Enter the days here or -1 to exit");
            userPrompt = input.nextInt();

            switch (userPrompt) {
                case 1:
                    day = "First day";
                    break;
                case 2:
                    day = "Second day";
                    break;
                case 3:
                    day = "Third day";
                case 4:
                    day = "Fourth day";
                    break;
                case 5:
                    day = "Fifth day";
                    break;
                case 6:
                    day = "Sixth day";
                    break;
                case 7:
                    day = "Seventh day";
                    break;
                case 8:
                    day = "Eighth day";
                    break;
                case 9:
                    day = "Ninth day";
                    break;
                case 10:
                    day = "tenth day";
                    break;
                case 11:
                    day = "eleventh day";
                    break;
                case 12:
                    day = "Twelve day";
            }
            System.out.printf("On the %s of Christmas my true love gave to me", day);

            switch (userPrompt) {
                case 12:
                    System.out.println("twelve day Ladies dancing");

                case 11:
                    System.out.println(" eleven day Lords a-leaping");

                case 10:
                    System.out.println(" ten day Drummers drumming");

                case 9:
                    System.out.println("nine day Pipers piping");

                case 8:
                    System.out.println(" eight day Maids a-milking");

                case 7:
                    System.out.println(" seven day Swans a-swimming Maids a-");

                case 6:
                    System.out.println(" six day Geese a-laying");

                case 5:
                    System.out.println(" five day Golden rings");

                case 4:
                    System.out.println(" four day Collie birds");

                case 3:
                    System.out.println("French hens");

                case 2:
                    System.out.println(" two day Turtle doves");

                case 1:
                    System.out.println("Partridge in a pear tree");

            }
        }
            while (userPrompt != -1) ;

        }

    }











