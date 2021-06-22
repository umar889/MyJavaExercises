package africa.semicolon.ChapterSeven;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 4, 8, 3};
        int[] b = {10, 11, 14, 9, 6};
        int[][] numbers = {{2, 5, 9}, {8, 2, 0}, {4, 7, 10}};

        int biggest = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                biggest = numbers[i][0];

                if (numbers[i][j] > biggest) {

                    biggest = numbers[i][j];

                }


//                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(biggest);
        }

    }
}
