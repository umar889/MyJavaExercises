package chapterfiveexercises;

public class WhileLoop {
    public static void main(String[] arg) throws InterruptedException {
        int counter = 1;
        while (counter <= 10){
            Thread.sleep(1000);
            System.out.printf(" %d", counter);
              ++counter;
    }
}
}
