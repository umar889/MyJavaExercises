//package africa.Chaptereight;
//
//import java.util.Random;
//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//public class MyRandom {
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        Random rand = new Random();
//
//        ArrayList<ArrayList<String>> arrList = new ArrayList<ArrayLisString();
//        ArrayList<String> question = new ArrayList<String>;
//        String choiceShuffle = new ArrayList<String>;
//        ArrayList<String> choice1 = new ArrayList<String>;
//        ArrayList<String> choice2 = new ArrayList<String>;
//        ArrayList<String> choice3 = new ArrayList<String>
//
//        int numQuestion = 3;
//        int randomNum = rand.nextInt(numQuestion);
//        int score = 0;
//        String questionShuffle;
//        questionShuffle = question.get(randomNum);
//        choiceShuffle = arrList.get(randomNum);
//
//        question.add("What is after a?");
//        question.add("What is after b?");
//        question.add("What is after c?");
//
//        choice1.add("a"); choice1.add("b"); choice1.add("c");
//        choice2.add("d"); choice2.add("c"); choice2.add("e");
//        choice3.add("d"); choice3.add("a"); choice3.add("b");
//
//        arrList.add(choice1);
//        arrList.add(choice2);
//        arrList.add(choice3);
//
//        String finalChoiceShuffle = choiceShuffle;
//        IntStream.iterate(1, x -> x <= question.size(), x -> x + 1).forEach(x -> {
//            System.out.print(question.get(randomNum));
//            Collections.shuffle(finalChoiceShuffle);
//            System.out.println(finalChoiceShuffle);
//        });
//    }
//}
//
