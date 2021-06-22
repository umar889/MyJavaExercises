package africa.semicolon.ChapterSeven;

public class IniArray {
    public static void main(String[] args) {

        int[] array = new  int[20];

        System.out.printf("%s%8s%n", "Value", "Index");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);


    }

}
