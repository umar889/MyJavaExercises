//package africa.Chaptereight;
//
//import javax.xml.transform.Result;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner Scanner = new Scanner(System.in);
//
//
//        String[][] myersBriggs = {{"a. expend energy, enjoy groups", "b. conserve energy, enjoy one-on-one"},
//                {"a. interpret literally", "b. look for meaning and possibilities"},
//                {"a. logical, thinking, questioning", "b. empathetic, feeling, accommodating"},
//                {"a. organized, orderly", "b. flexible, adaptable"},
//                {"a. more outgoing, think out loud", "b. more reserved, think to yourself"},
//                {"a. practical, realistic, experiential", "b. imaginative, innovative, theoretical"},
//                {"a. candid, straight forward, frank", "b. tactful, kind, encouraging"},
//                {"a. plan, schedule", "b. unplanned, spontaneous"},
//                {"a. seek many tasks, public activities interaction with others", "b. seek private",
//                        "b solitary activities with quiet to concentrate"},
//                {"a. standard, usual, conventional", "b. different, novel, unique"},
//                {"a. firm, tend to criticize, hold the line", "b. gentle, tend to appreciate, conciliate"},
//                {"a. regulated, structured", "b. easygoing, live and let live"},
//                {"a. external, communicative, express yourself", "b. internal, reticent, keep to yourself"},
//                {"a. focus on here-and-now", "b. look to the future, global perspective, big picture"},
//                {"a. tough-minded, just", "b. tender-hearted, merciful"},
//                {"a. preparation, plan ahead", "b. go with the flow, adapt as you go"},
//                {"a. active, initiate", "b. reflective, deliberate"},
//                {"a. facts, things, what is", "b. ideas, dreams, “what could be,” philosophical"},
//                {"a. matter of fact, issue-oriented", "b. sensitive, people-oriented, compassionate"},
//                {"a. control, govern ", "b. latitude, freedom"}};
//
//        int question = 1;
//        Scanner input = new Scanner(System.in);
//        char[] answers = new char[myersBriggs.length];
//
//        for (int i = 0; i < myersBriggs.length; i++) {
//            System.out.println("Question " + question);
//            System.out.println("Choose the option that suits you");
//            for (int j = 0; j < 2; j++) {
//                System.out.println(myersBriggs[i][j]);
//            }
//            answers[i] = input.next().charAt(0);
//            System.out.println();
//
//            question++;
//        }
//        String tableHeader = String.format("%5s%5s%5s", " ", "A", "B");
//
//        System.out.print(tableHeader.repeat(4));
//        System.out.println();
//
//        for (int i = 1; i <= myersBriggs.length; i = i + 4) {
//            if (answers[i - 1] == 'A' || answers[i - 1] == 'a') {
//                System.out.printf("%5s%5s%5s", " ", " ", "A");
//            } else {
//                System.out.printf("%5s%5s%5s", " ", " ", "B");
//            }
//            if (answers[i] == 'A' || answers[i] == 'a') {
//                System.out.printf("%5s%5s%5s", " ", "A", " ");
//            } else {
//                System.out.printf("%5s%5s%5s", " ", " ", "B");
//            }
//            if (answers[i + 1] == 'A' || answers[i + 1] == 'a') {
//                System.out.printf("%5s%5s%5s", " ", "A", " ");
//            } else {
//                System.out.printf("%5s%5s%5s", " ", " ", "B");
//            }
//            if (answers[i + 2] == 'A' || answers[i + 2] == 'a') {
//                System.out.printf("%5s%5s%5s", " ", "A", " ");
//            } else {
//                System.out.printf("%5s%5s%5s", " ", " ", "B");
//            }
//
//            System.out.println();
//        }
//        System.out.printf("%5s", "Total" +);
//    }
//
