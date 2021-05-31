public class Mystery3 {
    public static void main(String[] args) {
        int row = 0;
        while (row >= 1){
            int column = 1;

            while (column <= 10)

                System.out.println(row % 2 == 1 ? "<" : ">");
            ++column;
        }

        System.out.println(row % 2 == 1 ? "****" : "++++++++");
        --row;

    }
}
