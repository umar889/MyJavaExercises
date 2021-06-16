package africa.semicolon.ChapterSeven;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[]scores = {45,34,78,28,};
                int counter = 0;
                int sum = 0;
        while (counter<scores.length){
            sum = sum + scores[counter];
            counter++;
        }
        System.out.println(sum);
    }
}
